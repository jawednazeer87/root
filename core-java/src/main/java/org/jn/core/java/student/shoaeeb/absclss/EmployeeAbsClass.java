package org.jn.core.java.student.shoaeeb.absclss;

public abstract class EmployeeAbsClass {
	int id;
	String employeeName;
	int employeeNum;
	int cityId;
	
	//setters
	public abstract void setId(int id);
	public abstract void setEmployeeName(String employeeName);
	public abstract void setEmployeeNum(int employeeNum);
	public abstract void setCityId(int cityId);
	
	//getters
	
	public int getId() {
		return this.id;
	}
	public String getEmployeeName() {
		return this.employeeName;
	}
	public int getEmployeeNum() {
		return this.employeeNum;
	}
	public int getCityId() {
		return this.cityId;
	}
}
