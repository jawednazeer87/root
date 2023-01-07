package org.jn.core.java.student.sayed.hassain.clss;

public class Employee {
	
	int id;
	String employeeName;
	int employeeNum;
	String dateHired;
	String cityId;
	
	public int getterId() {
		return id;
	}
	public String getterEmployeeName() {
		return employeeName;
	}
	public int getterEmployeeNum() {
		return employeeNum;
	}
	public String getterDateHired() {
		return dateHired;
	}
	public String getterCityId() {
		return cityId;
	}
	public void setterId(int id) {
		this.id=id;
	}
	public void setterEmployeeName(String employeeName) {
		this.employeeName=employeeName;
	}
	public void setterEmployeeNum(int employeeNum) {
		this.employeeNum=employeeNum;
	}
	public void setterDateHired(String dateHired) {
		this.dateHired=dateHired;
	}
	public void setterCityId(String cityId) {
		this.cityId=cityId;
	}

}
