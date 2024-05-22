package com.itbank.dao;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.itbank.model.AccountDAO;

@SpringBootTest
public class DaoTest {

	@Autowired
	private AccountDAO dao;
	
	@Test
	public void connect() {
		assertNotNull(dao.selectAll());
	}
}
