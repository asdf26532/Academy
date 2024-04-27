package service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashPw {

	public static String getHash(String pw) {
		
		try {
			MessageDigest md = MessageDigest.getInstance("sha-512");
		
			md.reset();
			md.update(pw.getBytes());
			
			String hash = String.format("%0128x", new BigInteger(1, md.digest()));
		
			return hash;
			
		} catch (NoSuchAlgorithmException e) {
			System.out.println("getHash ���� : " + e.getMessage());
			
		}
		
		return null;
	}
}
