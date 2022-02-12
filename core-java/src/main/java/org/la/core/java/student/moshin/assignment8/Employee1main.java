package org.la.core.java.student.moshin.assignment8;

public class Employee1main {
	
	public static void main(String[] args) {
		Employee1 employee = new Employee1();
		
		employee.setId(1);
		employee.setEmployeeName("Ansari moshin");
		employee.setEmployeeNum(2514);
		employee.setdateHired("7jun2012");
		employee.setCityId("524587");
		
		System.out.println("ID: "+employee.getId());
		System.out.println("Employee Name: "+employee.getEmployeeName());
		System.out.println("Employee Num: "+employee.getLastName());	
		System.out.println("Date: "+employee.getdateHired());
		System.out.println("Cityid: "+employee.getCityId());
				
	}
	
	
	
}
