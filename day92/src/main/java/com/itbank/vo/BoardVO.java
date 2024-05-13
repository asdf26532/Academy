package com.itbank.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/*
	board 테이블)
	IDX      NOT NULL NUMBER        
	TITLE    NOT NULL VARCHAR2(150) 
	CONTENTS NOT NULL CLOB          
	V_COUNT           NUMBER        
	W_DATE            DATE          
	USER_IDX          NUMBER
	
	board_view 뷰)
	NICK     NOT NULL VARCHAR2(20)  
*/


public class BoardVO {
	private int idx, user_idx, v_count;
	private String title, contents, nick;
	
	@JsonFormat(pattern = "yyyy년 MM월 dd일 a hh:mm:ss E", timezone = "GMT+9")
	private Date w_date;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public int getV_count() {
		return v_count;
	}
	public void setV_count(int v_count) {
		this.v_count = v_count;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Date getW_date() {
		return w_date;
	}
	public void setW_date(Date w_date) {
		this.w_date = w_date;
	}
}
