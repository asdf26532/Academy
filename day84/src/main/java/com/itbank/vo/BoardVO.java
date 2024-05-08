package com.itbank.vo;

import java.sql.Timestamp;

/*
	IDX      NOT NULL NUMBER        
	TITLE             VARCHAR2(200) 
	A_IDX    NOT NULL NUMBER  
	CONTENTS          CLOB          
	UPLOAD            VARCHAR2(200) 
	V_COUNT           NUMBER        
	W_DATE            TIMESTAMP(6)
	
	
	NICK			 VARCHAR2(60)
*/

public class BoardVO {
	private int idx, a_idx, v_count;
	private String title, nick;
	private String contents, upload;
	private Timestamp w_date;
	
	public int getA_idx() {
		return a_idx;
	}
	public void setA_idx(int a_idx) {
		this.a_idx = a_idx;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
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
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getUpload() {
		return upload;
	}
	public void setUpload(String upload) {
		this.upload = upload;
	}
	public Timestamp getW_date() {
		return w_date;
	}
	public void setW_date(Timestamp w_date) {
		this.w_date = w_date;
	}
}
