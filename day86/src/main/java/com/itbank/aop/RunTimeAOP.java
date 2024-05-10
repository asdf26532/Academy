package com.itbank.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RunTimeAOP {
	
	private static Logger log = LoggerFactory.getLogger(RunTimeAOP.class);

	@Around("execution(* *.*.service.*.*(..))")
	public Object timeCheck(ProceedingJoinPoint pjp) 
			throws Throwable {
		
		long start, end;
		start = System.currentTimeMillis();
		
		String msg = pjp.getSignature().getName();
		
		Object[] args = pjp.getArgs();
		Object result = pjp.proceed(args);
		
		end = System.currentTimeMillis();
		msg += " 소요시간 : " + (end - start) / 1000.0 + "초";
		
		log.debug(msg);
		
		return result;
	}
}
