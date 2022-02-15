package org.la.core.java.student.arfaz.assignment_10_class;

public class Employee {

//	id, employeeName, employeeNum, dateHired, cityId
	private int id;
	private String employeeName;
	private int employeeNum;
	private int dateHired;
	private int cityId;
	
	
	public int getid() {
		return id;
	}
	public int getDateHired() {
		return dateHired;
	}
	public void setDateHired(int dateHired) {
		this.dateHired = dateHired;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public void setid(int id) {
		this.id=id;
	}
	public String getemployeeName() {
		return employeeName;
	}
	public void setemployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	public void setemployeeNum(int employeeNum) {
		this.employeeNum=employeeNum;
	}
	public int getemployeeNum() {
		return employeeNum;
	}
	

}
