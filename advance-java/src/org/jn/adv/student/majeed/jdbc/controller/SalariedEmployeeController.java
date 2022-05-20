package org.jn.adv.student.majeed.jdbc.controller;


import org.jn.adv.student.majeed.jdbc.model.SalariedEmployee;
import org.jn.adv.student.majeed.jdbc.service.SalariedEmployeeService;
import org.jn.adv.student.majeed.jdbc.dto.SalariedEmployeeDTO;
import org.jn.adv.student.majeed.jdbc.util.GSONGenericUtil;

import java.util.List;
import java.util.ArrayList;

/**
* @author AbdulMajeed
*
*/

public class SalariedEmployeeController 
{
	static SalariedEmployeeService salariedEmployeeService = new SalariedEmployeeService();
	
	public static void main(String[] args) 
	{
		//create();				
		
		//getAll().stream().forEach(System.out::println);
		
		//findById();
		deleteById();
	}
	
	static void create() 
	{
		SalariedEmployee salariedEmployee = new SalariedEmployee();
		salariedEmployee.setId(2);
		salariedEmployee.setAnnualSalary(8000000.00);
		salariedEmployee.setEmployeeId(2001);
		salariedEmployeeService.create(salariedEmployee);
		salariedEmployeeService.connectionClose();
	}
	
	static List<SalariedEmployeeDTO> getAll() {
		List<SalariedEmployee> salariedEmployeeList = salariedEmployeeService.getAll();
		salariedEmployeeService.connectionClose();
		final List<SalariedEmployeeDTO> dtoList = new ArrayList<>();
		salariedEmployeeList.stream().forEach(salariedEmployee-> {
			SalariedEmployeeDTO dto = GSONGenericUtil.map(salariedEmployee, SalariedEmployeeDTO.class);
			dtoList.add(dto);
		});
		return dtoList;
	}	

	static List<SalariedEmployee> getAlls(){
		List<SalariedEmployee> salariedEmployeeList= salariedEmployeeService.getAll();
		System.out.println(salariedEmployeeList);
		salariedEmployeeService.connectionClose();
		return salariedEmployeeList;
	
	}
	
	static void deleteById() {
		SalariedEmployee salariedEmployee = new SalariedEmployee();
		salariedEmployee = salariedEmployeeService.deleteById(1);
		System.out.println(salariedEmployee);
	}
	
	static void findById() {
		SalariedEmployee salariedEmployee = new SalariedEmployee();
	salariedEmployee= salariedEmployeeService.findById(2);
		System.out.println(salariedEmployee);
		salariedEmployeeService.connectionClose();
	}
	
}
