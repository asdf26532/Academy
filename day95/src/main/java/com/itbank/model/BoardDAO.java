package com.itbank.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.vo.BoardVO;

@Mapper
public interface BoardDAO {
	
	@Select("select banner from v$version")
	String test();

	@Select("select * from board_view where idx = #{idx}")
	BoardVO selectIdx(int idx);

	@Delete("delete from board where idx = #{idx}")
	int delete(int idx);
	
	@Update("update board set v_count = v_count + 1 where idx = #{idx}")
	void updateV_count(int idx);
	
	int totalBoard(BoardVO input);
	
	List<BoardVO> selectAll(Map<String, Object> param);
	
	int insert(BoardVO input);

	int update(BoardVO input);
}
