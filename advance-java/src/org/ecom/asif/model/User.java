package org.ecom.asif.model;

import java.io.Serializable;

import java.util.Date;

//model class
public class User implements Serializable{

	private static final long serialVersionUID = -1582067386243719716L;

	private int id;
	private String firstName;
	private String lastName;
	private Date dob;
	private String email;
	private String fatherName;
	private boolean gender;
	private String country;
	
	public User() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public boolean getGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "id: "+id+"   firstName: "+firstName+"   lastName: "+lastName+"   dob: "+dob
				+"   email: "+email+"   fatherName: "+fatherName+"   gender: "+gender+"   country: "+country;
	}
}
