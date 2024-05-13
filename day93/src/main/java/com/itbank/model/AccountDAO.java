package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.itbank.vo.AccountVO;

public interface AccountDAO {
	@Select("select banner from v$version")
	String test();

	@Select("select * from account order by idx desc")
	List<AccountVO> selectAll();

	@Select("select * from account "
			+ "where userid = #{userid} "
			+ "and userpw = #{userpw}")
	AccountVO selectOne(AccountVO input);
}
