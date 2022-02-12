package org.la.core.java.student.tanseer.assignment8.classes;

import java.util.Date;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Date date = new Date();
		Employee employee = new Employee();
		employee.setId(1010);
		employee.setEmployeeName("Ahmed");
		employee.setEmployeeNum(4343);
		employee.setDateHired(date);
		employee.setCityId(560051);
		employee.display();
	}
}
