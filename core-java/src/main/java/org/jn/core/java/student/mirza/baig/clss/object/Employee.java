package org.jn.core.java.student.mirza.baig.clss.object;

import java.util.Date;

public class Employee {

	private String employeeName;
	
	private int employeeNum;
	private Date date;
	
	private String cityId;
	
	
	public void setEmployeeName(String employeeName) {
		
		this.employeeName= employeeName;
	}
	public String getEmployeeName() {
		
		return employeeName;
		
	}
	public void setEmployeeNum(int employeeNum) {
		
		this.employeeNum= employeeNum;
	}
	public int getEmpoloyeeNum() {
		
		return employeeNum;
			
}
	
	
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCityId() {
		return cityId;
	}
	
	
	
}





//Create a class Employee having member variables id, employeeName, employeeNum, dateHired, cityId. 
//create getters and setters for all member variables. Create object of Employee class in other class 
//inside main method and set all member values and print all member values using getters.