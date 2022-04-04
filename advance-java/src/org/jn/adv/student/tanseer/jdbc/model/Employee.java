package org.jn.adv.student.tanseer.jdbc.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable
{
private static final long serialVersionUID = -1443814004539007341L;
	
	private Integer id;
	private Integer companyId;
	private String firstName;
	private String lastName;
	private Double salary;
	private LocalDate dob;
	private boolean gender;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public boolean getGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "{id: "+id+", firstName: "+firstName+", lastName: "+lastName+", salary:  "+salary+ ", dob: "+dob+ ", gender: "+gender+"}";
	}
	
	
}
