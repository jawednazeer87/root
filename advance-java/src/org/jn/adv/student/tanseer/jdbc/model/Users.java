package org.jn.adv.student.tanseer.jdbc.model;

import java.io.Serializable;
import java.time.LocalDate;

/*users ( id, full_name, email, gender, date_of_birth, country_code, created_at )*/

public class Users implements Serializable {
	
	private static final long serialVersionUID = -1443814004539007341L;
	
	private Integer id;
	private String fullName;
	private String email;
	private boolean gender;
	private LocalDate dob;
	private Integer countryCode;
	private String createdAt;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Integer getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	@Override
	public String toString() {
		return "{id: "+id+", fullName: "+fullName+", email: "+email+", gender:  "+gender+ ", Date of birth: "+dob+ ", country code: "+countryCode+ "created at: "+createdAt+"}";
	}
}
