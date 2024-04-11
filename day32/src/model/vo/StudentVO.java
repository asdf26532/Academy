package model.vo;

import java.util.Scanner;

/*
	IDX  NOT NULL NUMBER       
	NAME NOT NULL VARCHAR2(30) 
	KOR           NUMBER       
	ENG           NUMBER       
	MAT           NUMBER
*/

public class StudentVO {
	private int idx;
	private String name;
	private int kor, eng, mat;
	
	@Override
	public String toString() {
		String msg = "%d %s %d %d %d";
		msg = String.format(msg, idx, name, kor, eng, mat);
		
		return msg;
	}
	
	public void input(Scanner sc) {
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("국 영 수 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
	}
	
	public void update(Scanner sc) {
		System.out.print("변경할 학번 : ");
		idx = sc.nextInt();
		
		input(sc);
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}

}
