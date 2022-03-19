package org.jn.adv.waleed.jdbc.controller;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.jn.adv.waleed.jdbc.dto.EmployeeDTO;
import org.jn.adv.waleed.jdbc.model.Employee;
import org.jn.adv.waleed.jdbc.service.EmployeeService;

/**
 * @author Waleed Rizq
 *
 * @date Mar 13, 2022
 */
public class EmployeeController {
	static EmployeeService employeeService = new EmployeeService();
	
	public static void main(String[] args) {
		
		create();
	//getAllPrint();
		//findById();
		// update();
		/*
		getAll().stream().forEach(employee-> {
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setId(employee.getId());
			employeeDTO.setCompanyId(employee.getCompanyId());
			employeeDTO.setFirstName(employee.getFirstName());
			employeeDTO.setLastName(employee.getLastName());
			employeeDTO.setDob(employee.getDob());
			employeeDTO.setSalary(employee.getSalary());
			employeeDTO.setGenderValue(employee.getGender()?"male":"female");
			Calendar birthDay = Calendar.getInstance();
		    birthDay.setTimeInMillis(employee.getDob().getTime());
		    long currentTime = System.currentTimeMillis();
		    Calendar now = Calendar.getInstance();
		    now.setTimeInMillis(currentTime);
		    employeeDTO.setAge(now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR));
			System.out.println(employeeDTO);
			
		});
		*/
		
		
		
		
		
		
		
		
}
	static void create () {
		//EmployeeService employeeService = new EmployeeService();
		Employee employee = new Employee();
		employee.setCompanyId(11);
		employee.setFirstName("Owais");
		employee.setLastName("Waleed");
		employee.setDob(new Date(1999, 11, 27));
		employee.setSalary(10000.0);
		employee.setGender(true); 			//true-> male, false-> female
		employeeService.create(employee);
		employeeService.connectionClose();
	}
	
	static void update() {
		Employee employee = new Employee();
		employee.setCompanyId(12345);
	    employee.setFirstName("Moath");
		employee.setLastName("Waleed");
		employee.setDob(new Date(2007, 07, 21));
		employee.setSalary(7000.0);
		employee.setGender(true); 			//true-> male, false-> female
		employeeService.update(employee);
		employeeService.connectionClose();
	}
		
		

	
	static void getAllPrint() {
		//EmployeeService employeeService = new EmployeeService();
		List<Employee> employeeList= employeeService.getAll();
		System.out.println(employeeList);
		employeeService.connectionClose();
	}
	
	static List<Employee> getAll(){
		List<Employee> employeeList= employeeService.getAll();
		//System.out.println(employeeList);
		employeeService.connectionClose();
		return employeeList;
	
	}
	
	static void findById() {
		Employee employee = new Employee();
	employee= employeeService.findById(123);
		System.out.println(employee);
		employeeService.connectionClose();
	}
	
}
