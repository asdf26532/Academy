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

	@Insert("insert into board(nick) values(#{nick})")
	void insertTest1(String nick);
	
	@Insert("insert into board(idx, nick) values(#{idx}, #{nick})")
	void insertTest2(BoardVO row);

}
