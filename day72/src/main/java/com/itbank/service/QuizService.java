package com.itbank.service;

import org.springframework.stereotype.Service;

import com.itbank.model.vo.AccountVO;

@Service
public class QuizService {
	
	AccountVO[] db = new AccountVO[] {
		new AccountVO("itbank", "it", "아뱅"),
		new AccountVO("user1", "1", "유저1"),
		new AccountVO("root", "qwe", "관리자")
	};

	public String login(AccountVO input) {
		String msg = "로그인 실패";
		
		for (int i = 0; i < db.length; i++) {
			if (db[i].equals(input)) {
				msg = db[i].getNick() + "님 로그인 성공";
				break;
			}
		}
		
		return msg;
	}
	
}
