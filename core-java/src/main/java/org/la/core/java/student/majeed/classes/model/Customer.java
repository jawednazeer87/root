package org.la.core.java.student.majeed.classes.model;

import java.util.Date;

public class Customer {
	private String idNumber;
	private String name;
	private String idType;
	private Date dob;
	private String nationality;
	
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public void setIdType(String idType) {
		this.idType = idType;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}	
	
	public String getIdNumber() {
		return idNumber;
	}	

	public String getName() {
		return name;
	}
	
	public String getIdType() {
		return idType;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public String getNationality() {
		return nationality;
	}	

	public void printCustomer() {
		System.out.println("idNumber : "+idNumber);
		System.out.println("name : "+name);
		System.out.println("idType : "+idType);
		System.out.println("dob : "+dob);
		System.out.println("nationality : "+nationality);
	}
}
