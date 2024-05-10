package com.itbank.vo;

import java.sql.Timestamp;

import org.springframework.web.multipart.MultipartFile;

/*
	IDX     NOT NULL NUMBER        
	USERID  NOT NULL VARCHAR2(20)  
	USERPW  NOT NULL VARCHAR2(128) 
	NICK    NOT NULL VARCHAR2(60)  
	EMAIL   NOT NULL VARCHAR2(100) 
	J_DATE           TIMESTAMP(6)  
	PROFILE NOT NULL NUMBER
	
	
	image	프로필 이미지 경로
	upload	실제 파일을 처리할 객체
*/

public class AccountVO {
	private int idx, profile;
	private String userid, userpw;
	private String nick, email, image;
	private Timestamp j_date;
	
	private  MultipartFile upload;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getProfile() {
		return profile;
	}
	public void setProfile(int profile) {
		this.profile = profile;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Timestamp getJ_date() {
		return j_date;
	}
	public void setJ_date(Timestamp j_date) {
		this.j_date = j_date;
	}
	public MultipartFile getUpload() {
		return upload;
	}
	public void setUpload(MultipartFile upload) {
		this.upload = upload;
	}
}
