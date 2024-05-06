package com.itbank.service;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.components.SHA512;
import com.itbank.model.AccountDAO;
import com.itbank.model.vo.AccountVO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO dao;
	
	@Autowired
	private SHA512 hash;

	public List<AccountVO> getAccounts() {
		return dao.selectAll();
	}

	public AccountVO login(AccountVO user) {
		String pw = user.getUserpw();
		user.setUserpw(hash.getHash(pw));
		
		return dao.selectOne(user);
	}

	public int addAccount(AccountVO input) {
		return dao.insert(input);
	}
	
	public int updateAccount(AccountVO input) {
		return dao.update(input);
	}

	public String findPw(AccountVO input) {
		input = dao.selectFind(input);
		
		if (input == null) {
			return "일치하는 정보가 없습니다";
		}
		
		String newPw = UUID.randomUUID().toString().substring(0, 6);
		String hashPw = hash.getHash(newPw);
		
		input.setUserpw(hashPw);
		dao.update(input);
		
		
		return newPw;
	}
	
}
