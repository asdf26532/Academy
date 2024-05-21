package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.itbank.vo.BoardVO;

@Mapper
public interface BoardDAO {

	@Select("select * from board_view "
			+ "order by idx desc "
			+ "offset 0 rows "
			+ "fetch first 10 rows only")
	List<BoardVO> selectAll();

	
}
