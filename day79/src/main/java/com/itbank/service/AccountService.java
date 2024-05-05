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
		String pw = input.getUserpw();
		input.setUserpw(hash.getHash(pw));
		
		return dao.insert(input);
	}

	
	// 정보 수정, 패스워드 찾기 구현
	public int updateAccount(AccountVO input, HttpSession session) {
		// 현재 로그인 중인 계정의 번호를 가져온다
		AccountVO user = (AccountVO) session.getAttribute("user");
		int idx = user.getIdx();
		
		// 해시 처리
		String pw = input.getUserpw();
		
		input.setIdx(idx);
		input.setUserpw(hash.getHash(pw));
		
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
