package com.itbank.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itbank.components.SHA512;
import com.itbank.model.vo.AccountVO;

@Component
@Aspect
public class AccountAOP {
	@Autowired
	private SHA512 hash;
	
	@Before("execution(int *.*.service.AccountService.*(com.itbank.model.vo.AccountVO))")
	public void hashPw(JoinPoint jp) {
		AccountVO input = (AccountVO) jp.getArgs()[0];
		
		String pw = input.getUserpw();
		input.setUserpw(hash.getHash(pw));
	}
}
