package jdbc;

import java.sql.Date;

/*
	NAME      VARCHAR2(20) 
	HEIGHT    NUMBER       
	BIRTH     DATE
*/

public class PersonVO {
	private String name;
	private double height;
	private Date birth;
	
	@Override
	public String toString() {
		String msg = "%s %.1f %s";
		msg = String.format(msg, name, height, birth);
		
		return msg;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
}
