package com.itbank.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.vo.BoardVO;
import com.itbank.vo.Paging;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;

	public Map<String, Object> getBoards(BoardVO input) {
		int totalBoard = dao.totalBoard(input);
		
		Paging pg = new Paging(input.getPage(), totalBoard);
		Map<String, Object> param = new HashMap<>();

		param.put("offset", pg.getOffset());
		param.put("perCount", pg.getPerCount());
		param.put("type", input.getType());
		param.put("search", input.getSearch());
		
		Map<String, Object> result = new HashMap<>();
		
		result.put("pg", pg);
		result.put("list", dao.selectAll(param));
		
		return result;
	}

	public BoardVO getBoard(int idx) {
		dao.updateV_count(idx);
		return dao.selectIdx(idx);
	}

	public int addBoard(BoardVO input) {
		return dao.insert(input);
	}

	public int deleteBoard(int idx) {
		return dao.delete(idx);
	}

	public int updateBoard(BoardVO input) {
		return dao.update(input);
	}
	
}
