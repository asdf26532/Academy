package com.itbank.vo;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

/*
	IDX     NOT NULL NUMBER        
	USERID  NOT NULL VARCHAR2(20)  
	USERPW  NOT NULL VARCHAR2(128) 
	NICK    NOT NULL VARCHAR2(60)  
	EMAIL   NOT NULL VARCHAR2(100) 
	J_DATE           TIMESTAMP(6)  
	PROFILE NOT NULL NUMBER
*/

@Getter
@Setter
public class AccountVO {
	private int idx, profile;
	private String userid, userpw;
	private String nick, email;
	private Timestamp j_date;
}
