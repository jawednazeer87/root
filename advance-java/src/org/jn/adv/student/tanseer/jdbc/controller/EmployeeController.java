package org.jn.adv.student.tanseer.jdbc.controller;

import java.time.LocalDate;

import org.jn.adv.student.tanseer.jdbc.model.Employee;
import org.jn.adv.student.tanseer.jdbc.service.EmployeeService;

public class EmployeeController 
{
	static EmployeeService employeeService = new EmployeeService();
	
	public static void main(String[] args) 
	{
		create();
	}
	
	static void create() 
	{
		Employee employee = new Employee();
		employee.setCompanyId(1);
		employee.setFirstName("Tanseer");
		employee.setLastName("Ahmed");
		LocalDate localDate = LocalDate.of(1998, 05, 17);
		employee.setDob(localDate);
		employee.setSalary(90000.0);
		employee.setGender(true); 			//true-> male, false-> female
		employeeService.create(employee);
		employeeService.connectionClose();
	}
}
