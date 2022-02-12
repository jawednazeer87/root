package org.la.core.java.student.tanseer.assignment8.classes;
/*
 * Create a class Users having member variables id, fullName, email, gender, dateOfBirth, 
 * countryCode, createdAt. create getters and setters for all member variables. Create object of 
 * Users class in other class inside main method and set all member values and print all member
 * values using getters.
 */

import java.util.Date;

public class Users 
{
	private int id;
	private String fullName;
	private String email;
	private String gender;
	private Date dob;
	private int countryCode;
	private String createdAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public void display()
	{
		System.out.println("ID\t\t : "+id);
		System.out.println("Full Name\t : "+fullName);
		System.out.println("Gmail\t\t : "+email);
		System.out.println("Gender\t\t : "+gender);
		System.out.println("DOB\t\t : "+dob);
		System.out.println("Country Code\t : "+countryCode);
		System.out.println("Created at\t : "+createdAt);
		
	}
	
}
