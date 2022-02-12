package org.la.core.java.student.majeed.assignment8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
6.	Create a class Employee having member variables id, employeeName, employeeNum, dateHired, cityId. 
create getters and setters for all member variables. 
Create object of Employee class in other class inside main method and set all 
member values and print all member values using getters.
 */

public class EmployeeMain {
	
	public static void main(String[] args) throws ParseException {
		Employee employee = new Employee();
		
		employee.setId(1);
		employee.setEmployeeName("Mohammed");
		employee.setEmployeeNum(201);
		String hireDate="21/12/2020";  
		employee.setDateHired(new SimpleDateFormat("dd/MM/yyyy").parse(hireDate));
		employee.setCityId(3001);
		
		System.out.println(employee.getId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeNum());
		System.out.println(employee.getDateHired());
		System.out.println(employee.getCityId());
		
	}
	
}
