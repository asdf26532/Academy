package com.itbank.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

	public int total(int n) {
		return n * (n + 1) / 2;
	}
	
}
