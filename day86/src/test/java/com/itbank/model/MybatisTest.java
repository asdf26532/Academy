package com.itbank.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MybatisTest {

	@Autowired
	private BoardDAO dao;
	
	@Test
	public void connect() {
		assertNotNull(dao);
	}
	
	@Test
	public void run() {
		String result = "Oracle Database 18c Express Edition Release 18.0.0.0.0 - Production";
		assertEquals(result, dao.test());
	}
}
