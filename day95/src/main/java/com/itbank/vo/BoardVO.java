package com.itbank.vo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

/*
 	테이블)
	IDX      NOT NULL NUMBER        
	TITLE    NOT NULL VARCHAR2(150) 
	USER_IDX          NUMBER  
	CONTENTS NOT NULL CLOB          
	V_COUNT           NUMBER        
	W_DATE            DATE
	
	뷰)
	NICK     NOT NULL VARCHAR2(20)
	
	검색)
	type, search, page
*/

@Getter
@Setter
public class BoardVO {
	private int idx, user_idx, v_count;
	private String title, contents, nick;
	private Date w_date;
	private String type, search;
	private int page;
}
