package com.itbank.component;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Component;

@Component
public class Hash {
	
	public String getHash(String pw) 
			throws NoSuchAlgorithmException {
		
		MessageDigest md = MessageDigest.getInstance("sha-512");
		
		md.reset();
		md.update(pw.getBytes());
		
		String hashPw = String.format("%0128x", 
							new BigInteger(1, md.digest()));
		
		return hashPw;
	}
}
