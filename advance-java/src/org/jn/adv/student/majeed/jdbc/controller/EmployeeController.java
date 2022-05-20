package org.jn.adv.student.majeed.jdbc.controller;


import org.jn.adv.student.majeed.jdbc.model.Employee;
import org.jn.adv.student.majeed.jdbc.service.EmployeeService;
import org.jn.adv.student.majeed.jdbc.dto.EmployeeDTO;
import org.jn.adv.student.majeed.jdbc.util.GSONGenericUtil;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

/**
* @author AbdulMajeed
*
*/

public class EmployeeController 
{
	static EmployeeService employeeService = new EmployeeService();
	
	public static void main(String[] args) 
	{
		create();				
		
		//getAll().stream().forEach(System.out::println);
//		System.out.println();
		
//		findById();
//		System.out.println();
		
//		getByDobRange().stream().forEach(System.out::println);
//		System.out.println();
		
//		deleteById();
//		System.out.println();
		
//		findById();
//		System.out.println();
			

	}
	
	static void create() 
	{
		Employee employee = new Employee();
		employee.setCompanyId(2001);
		employee.setFirstName("Abdul Majeed");
		employee.setLastName("Mohammed");
		LocalDate localDate = LocalDate.of(1991, 01, 01);
		employee.setDob(localDate);
		employee.setSalary(499999.0);
		employee.setGender(true); 			//true-> male, false-> female
		employeeService.create(employee);
		employeeService.connectionClose();
	}
	
	static List<EmployeeDTO> getAll() {
		List<Employee> employeeList = employeeService.getAll();
		employeeService.connectionClose();
		final List<EmployeeDTO> dtoList = new ArrayList<>();
		employeeList.stream().forEach(employee-> {
			EmployeeDTO dto = GSONGenericUtil.map(employee, EmployeeDTO.class);
			dtoList.add(dto);
		});
		return dtoList;
	}	

	static List<Employee> getAlls(){
		List<Employee> employeeList= employeeService.getAll();
		System.out.println(employeeList);
		employeeService.connectionClose();
		return employeeList;
	
	}
	
	static void deleteById() {
		Employee employee = new Employee();
		employee = employeeService.deleteById(1);
		System.out.println(employee);
	}
	
	static void findById() {
		Employee employee = new Employee();
	employee= employeeService.findById(2);
		System.out.println(employee);
		employeeService.connectionClose();
	}
	
}
