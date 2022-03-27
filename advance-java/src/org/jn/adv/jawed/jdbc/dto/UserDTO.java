package org.jn.adv.jawed.jdbc.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

import org.jn.adv.jawed.util.DateUtil;

import static org.jn.adv.jawed.constant.ProjectConstants.DD_MM_YYYY;

//dto class
public class UserDTO implements Serializable{

	private static final long serialVersionUID = -1582067386243719716L;

	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private String email;
	private String fatherName;
	private boolean gender;
	private String country;
	private int age;
	private String genderValue;
	private String completeName;
	private String dobString;
	
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
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

	/**
	 * @return the age
	 */
	public int getAge() {
		setAge(age);
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if(age==0) {
			age = Period.between(dob, LocalDate.now()).getYears();
		}
		this.age = age;
	}
	/**
	 * @return the genderValue
	 */
	public String getGenderValue() {
		setGenderValue(genderValue);
		return genderValue;
	}
	/**
	 * @param genderValue the genderValue to set
	 */
	public void setGenderValue(String genderValue) {
		if(genderValue==null) {
			this.genderValue = gender ? "male" : "female";
		}
		else {
			this.genderValue = genderValue;
		}
	}
	/**
	 * @return the completeName
	 */
	public String getCompleteName() {
		setCompleteName(completeName);
		return completeName;
	}
	/**
	 * @param completeName the completeName to set
	 */
	public void setCompleteName(String completeName) {
		if(completeName==null) {
			this.completeName = firstName + lastName;
		}
		else {
			this.completeName = completeName;
		}
	}
	
	/**
	 * @return the dobString
	 */
	public String getDobString() {
		setDobString(dobString);
		return dobString;
	}
	/**
	 * @param dobString the dobString to set
	 */
	public void setDobString(String dobString) {
		if(dobString==null){
			dobString = DateUtil.localDateToString(DD_MM_YYYY, dob);
		}
		this.dobString = dobString;
	}
	
	@Override
	public String toString() {
		return "{id: "+id+", firstName: "+firstName+", lastName: "+lastName+", dob: "+dob
				+", email: "+email+", fatherName: "+fatherName+", gender: "+gender+", country: "+country
				+", age: "+age+", genderValue: "+genderValue+", completeName: "+completeName+", dobString: "+dobString+"}";
	}
}
