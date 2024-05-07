package com.itbank.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class AopTest {
	
	@Test
	public void runTime() throws InterruptedException {
		long begin = System.currentTimeMillis();
		
		System.out.println("로직 수행~~");
		Thread.sleep(1000);
		
		long end = System.currentTimeMillis();
		
		System.out.println("소요 시간 : " + (end - begin) / 1000.0);
	}
}
