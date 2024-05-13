package com.itbank.mybatis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itbank.model.AccountDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class DAOTest {
	
	@Autowired
	private AccountDAO dao;
	
	@Test
	public void connect() {
		String result = dao.test().substring(0, 6);

		assertEquals(result, "Oracle");
	}
	
}
