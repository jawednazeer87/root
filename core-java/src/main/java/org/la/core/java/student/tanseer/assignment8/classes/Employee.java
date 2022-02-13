package org.la.core.java.student.tanseer.assignment8.classes;

import java.util.Date;

/*
 * Create a class Employee having member variables id, employeeName, employeeNum, dateHired, 
 * cityId. create getters and setters for all member variables. Create object of Employee class 
 * in other class inside main method and set all member values and print all member values using getters.
 */
public class Employee 
{
	private int id;
	private String employeeName;
	private int employeeNum;
	private Date dateHired;
	private int cityId;
	
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
	public Date getDateHired() {
		return dateHired;
	}
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
	public void display()
	{
		System.out.println("Employee ID\t : "+id);
		System.out.println("Employee Name\t : "+employeeName);
		System.out.println("Employee Num\t : "+employeeNum);
		System.out.println("Date Hired\t : "+dateHired);
		System.out.println("City ID\t\t : "+cityId);
	}
}
