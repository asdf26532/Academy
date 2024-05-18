package com.itbank.myBatis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.itbank.model.BoardDAO;

@SpringBootTest
public class DAOTest {
	
	@Autowired
	private BoardDAO dao;
	
	@Test
	public void connect() {
		String result = dao.test().substring(0, 6);
		assertEquals("Oracle", result);
	}
}
