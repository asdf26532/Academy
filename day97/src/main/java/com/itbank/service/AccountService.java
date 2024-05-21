package com.itbank.service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.component.Hash;
import com.itbank.model.AccountDAO;
import com.itbank.vo.AccountVO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO dao;
	
	@Autowired
	private Hash hash;

	public List<AccountVO> getAccounts() {
		return dao.selectAll();
	}

	public AccountVO getAccount(AccountVO input) 
			throws NoSuchAlgorithmException {
		
		String pw = input.getUserpw();
		String hashPw = hash.getHash(pw);
		
		input.setUserpw(hashPw);
		
		return dao.selectOne(input);
	}
	
}
