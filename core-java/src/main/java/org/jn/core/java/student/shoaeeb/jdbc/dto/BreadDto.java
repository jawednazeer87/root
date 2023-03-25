package org.jn.core.java.student.shoaeeb.jdbc.dto;

import java.util.Date;

public class BreadDto {
	private int id;
	private String name;
	private Date creatDate;
	private Date expDate;
	private String type;
	private String emailOrg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmailOrg() {
		return emailOrg;
	}
	public void setEmailOrg(String emailOrg) {
		this.emailOrg = emailOrg;
	}
	@Override
	public String toString() {
		return "BreadDto [id=" + id + ", name=" + name + ", creatDate=" + creatDate + ", expDate=" + expDate + ", type="
				+ type + ", emailOrg=" + emailOrg + "]";
	}
}
