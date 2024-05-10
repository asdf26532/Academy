package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.itbank.vo.AccountVO;

public interface AccountDAO {
	
	@Select("select * from account order by idx desc")
	List<AccountVO> selectAll();

	@Delete("delete from account where idx = #{idx}")
	int delete(int idx);
	
	AccountVO selectOne(AccountVO input);

	int insert(AccountVO input);

	int selectIdx();

	int update(AccountVO input);
	
}
