package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class Employee {

	int id;
	String employeeName;
	int employeeNum;
	String dateHired; 
	int cityId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeNum=" + employeeNum + ", dateHired="
				+ dateHired + ", cityId=" + cityId + "]";
	}
	
	
	
}
