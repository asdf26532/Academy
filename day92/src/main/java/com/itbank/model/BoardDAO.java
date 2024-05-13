package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.itbank.vo.BoardVO;

public interface BoardDAO {
	
	@Select("select banner from v$version")
	public String test();

	@Delete("delete from board where idx = #{idx}")
	public int delete(int idx);
	
	public List<BoardVO> selectAll();

	public int insert(BoardVO input);

	public int update(BoardVO input);

}
