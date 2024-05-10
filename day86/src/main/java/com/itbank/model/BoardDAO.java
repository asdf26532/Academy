package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.itbank.vo.BoardVO;

public interface BoardDAO {

	@Select("select banner from v$version")
	String test();

	@Select("select * from board_view order by idx desc")
	List<BoardVO> selectAll();

	@Select("select * from board_view where idx = ${idx}")
	BoardVO selectOne(int idx);
	
	@Insert("insert into "
			+ "board(title, contents, a_idx, upload) "
			+ "values(#{title}, #{contents}, #{a_idx}, #{upload})")
	int insert(BoardVO input);

	@Select("select idx from board " + 
				"order by idx desc " + 
				"offset 0 rows " + 
				"fetch first 1 rows only")
	int selectLast();
	
}
