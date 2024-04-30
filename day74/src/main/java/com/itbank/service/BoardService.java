package com.itbank.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.model.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;

	public Map<String, Object> getBoards(Integer page) {
		if (page == null) {
			page = 1;
		}
		
		Paging pg = new Paging(page, dao.totalBoard());
		List<BoardVO> list = dao.selectAll(pg);
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("pg", pg);
		map.put("list", list);
		
		return map;
	}

	public int writeBoard(BoardVO input) {
		return dao.insert(input);
	}

	public BoardVO getBoard(int idx, boolean isView) {
		if (isView) {
			dao.viewUp(idx);
		}
		
		return dao.selectOne(idx);
	}

	public int deleteBoard(int idx) {
		return dao.delete(idx);
	}

	public int updateBoard(BoardVO input) {
		return dao.update(input);
	}

}
