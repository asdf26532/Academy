package com.itbank.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*
	execution		: AOP가 실행될 위치를 지정
	void			: 실행할 메서드의 반환형
	com.itbank...	: 실행할 메서드가 있는 패키지명
	TestService		: 실행할 메서드가 있는 클래스명
	firstAOP		: 실행할 메서드명
	()				: 그 메서드의 매개변수
	
	*				: 와일드 카드
	..				: 매개변수에서 사용하는 와일드 카드
*/

@Component
@Aspect
public class TestAOP {

	@Before("execution(void com.itbank.service.TestService.firstAOP())")
	public void start() {
		System.out.println("AOP 실행~");
	}
	
	@After("execution(* com.itbank.service.TestService.*(..))")
	public void stop() {
		System.out.println("AOP 끝~");
	}
	
	@Around("execution(* com.itbank.service.*.*(..))")
	public Object useTime(ProceedingJoinPoint jp) throws Throwable {
		long begin = System.currentTimeMillis();
		
		Object result = jp.proceed(jp.getArgs());
		// proceed() : 현재 실행될 메서드를 호출
		// getArgs() : 현재 실행될 메서드에 전달될 전달인자
		
		long end = System.currentTimeMillis();
		
		System.out.println("소요 시간 : " + (end - begin) / 1000.0);
		
		return result;
	}
}






