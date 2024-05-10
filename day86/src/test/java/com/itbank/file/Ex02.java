package com.itbank.file;

import java.io.File;

import org.junit.Test;

public class Ex02 {
	
	@Test
	public void test2() {
		File dir = new File("FileFolder");
		File file = new File(dir, "test1.txt");
		// File file = new File("FileFolder\\test1.txt");
		
		System.out.println("dir 유뮤? " + dir.exists());
		System.out.println("file 유뮤? " + file.exists() + "\n");
		
		System.out.println("디렉토리? " + dir.isDirectory());
		System.out.println("파일? " + file.isFile() + "\n");
		
		for (File f : dir.listFiles()) {
			String name = f.getName();
			int dot = name.indexOf(".");
			String ext = name.substring(dot, name.length());
			
			System.out.print(f + " - 타입 : ");
			System.out.println(ext);
		}
	}
}
