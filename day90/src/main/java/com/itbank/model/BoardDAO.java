package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.itbank.vo.BoardVO;

public interface BoardDAO {
	
	@Select("select banner from v$version")
	public String test();

	@Select("select * from board " + 
			"order by idx desc " + 
			"offset 0 rows " + 
			"fetch first 10 rows only")
	public List<BoardVO> selectAll();
}
