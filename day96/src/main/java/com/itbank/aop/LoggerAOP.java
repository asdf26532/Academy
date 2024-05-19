package com.itbank.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class LoggerAOP {
	
	@Before(value = "execution(* com.itbank.service.*.*(..))")
	public void logging() {
		
		log.info("메서드 호출!!!");
		
	}
}
