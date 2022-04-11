package org.jn.adv.student.tanseer.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.dto.EmployeeDTO;
import org.jn.adv.student.tanseer.jdbc.util.GSONGenericUtil;
import org.jn.adv.student.tanseer.jdbc.model.Employee;
import org.jn.adv.student.tanseer.jdbc.service.EmployeeService;

public class EmployeeController 
{
	static EmployeeService employeeService = new EmployeeService();
	
	public static void main(String[] args) 
	{
//		create();
		
//		getAll().stream().forEach(System.out::println);
//		System.out.println();
		
//		findById();
//		System.out.println();
		
//		getByDobRange().stream().forEach(System.out::println);
//		System.out.println();
		
		deleteById();
		System.out.println();
		
//		findById();
//		System.out.println();
			

	}
	
	static void create() 
	{
		Employee employee = new Employee();
		employee.setCompanyId(101);
		employee.setFirstName("Zakir");
		employee.setLastName("Khan");
		LocalDate localDate = LocalDate.of(1975, 05, 25);
		employee.setDob(localDate);
		employee.setSalary(29000.0);
		employee.setGender(true); 			//true-> male, false-> female
		employeeService.create(employee);
		employeeService.connectionClose();
	}
	
	static List<Employee> getAlls(){
		List<Employee> employeeList= employeeService.getAll();
		System.out.println(employeeList);
		employeeService.connectionClose();
		return employeeList;
	
	}
	
	static void deleteById() {
		Employee employee = new Employee();
		employee = employeeService.deleteById(2);
		System.out.println(employee);
	}
	
	static void findById() {
		Employee employee = new Employee();
	employee= employeeService.findById(2);
		System.out.println(employee);
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
	
	static List<EmployeeDTO> getByDobRange() {
		List<Employee> employeeList = employeeService.getByDobRange(LocalDate.of(1979, 01, 10), 
																	LocalDate.of(2021, 01, 10));
		employeeService.connectionClose();
		List<EmployeeDTO> dtoList = GSONGenericUtil.mapList(employeeList, EmployeeDTO.class);
		return dtoList;
	}
	
}
