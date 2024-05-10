package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.itbank.model.BoardDAO;
import com.itbank.vo.AccountVO;
import com.itbank.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;
	
	@Value("file:E:\\upload")
	private Resource rs;

	@Transactional(readOnly = true)
	public List<BoardVO> getBoards() {
		return dao.selectAll();
	}
	
	@Transactional(readOnly = true)
	public BoardVO getBoard(int idx) {
		return dao.selectOne(idx);
	}


	public int write(BoardVO input, MultipartFile file) throws IOException {
		// 파일 업로드를 수행
		String name = file.getOriginalFilename();
		File dir = rs.getFile();
		File dst = new File(dir, name);
		
		file.transferTo(dst);
		
		// DB에 정보를 저장
		// - 파일 이름을 가져와 저장
		input.setUpload(name);
		dao.insert(input);
		
		// 최신 글번호(idx)를 가져와 반환
		
		return dao.selectLast();
	}
}
