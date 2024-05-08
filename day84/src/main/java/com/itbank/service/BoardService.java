package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itbank.model.BoardDAO;
import com.itbank.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;

	@Transactional(readOnly = true)
	public List<BoardVO> getBoards() {
		return dao.selectAll();
	}

	@Transactional(rollbackFor = DuplicateKeyException.class)
	public void txTest() {
		dao.insertTest1("관리자");
		
		BoardVO row = new BoardVO();
		row.setIdx(1001);
		row.setNick("관리자");
		
		dao.insertTest2(row);
	}
	
}
