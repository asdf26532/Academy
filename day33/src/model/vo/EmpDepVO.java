package model.vo;

import java.sql.Date;

/*
	emp와 dep 테이블 동시에 사용할 VO
	1. emp 테이블
	-------------------------------
	IDX      NOT NULL NUMBER       
	NAME     NOT NULL VARCHAR2(30) 
	POSITION NOT NULL VARCHAR2(10) 
	GENDER            VARCHAR2(6)  
	BIRTH    NOT NULL DATE         
	H_DATE   NOT NULL DATE         
	PHONE    NOT NULL VARCHAR2(15) 
	EMAIL    NOT NULL VARCHAR2(60) 
	SALARY   NOT NULL NUMBER       
	DEP_IDX           NUMBER
	
	2. dep 테이블
	-------------------------------  
	DEP_NAME   NOT NULL VARCHAR2(30) 
	DEP_CREATE NOT NULL DATE         
	DEP_PHONE  NOT NULL VARCHAR2(15) 
	DEP_EMAIL  NOT NULL VARCHAR2(60)
*/

public class EmpDepVO {
	private int idx, salary, dep_idx;
	private String name, position, gender;
	private Date birth, h_date;
	private String phone, email;
	
	private String dep_name, dep_phone, dep_email;
	private Date dep_create;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDep_idx() {
		return dep_idx;
	}
	public void setDep_idx(int dep_idx) {
		this.dep_idx = dep_idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Date getH_date() {
		return h_date;
	}
	public void setH_date(Date h_date) {
		this.h_date = h_date;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public String getDep_phone() {
		return dep_phone;
	}
	public void setDep_phone(String dep_phone) {
		this.dep_phone = dep_phone;
	}
	public String getDep_email() {
		return dep_email;
	}
	public void setDep_email(String dep_email) {
		this.dep_email = dep_email;
	}
	public Date getDep_create() {
		return dep_create;
	}
	public void setDep_create(Date dep_create) {
		this.dep_create = dep_create;
	}
}
