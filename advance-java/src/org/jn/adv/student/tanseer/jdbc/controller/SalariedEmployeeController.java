package org.jn.adv.student.tanseer.jdbc.controller;

import org.jn.adv.student.tanseer.jdbc.model.SalariedEmployee;
import org.jn.adv.student.tanseer.jdbc.service.SalariedEmployeeService;

public class SalariedEmployeeController {

	static SalariedEmployeeService salariedEmployeeService = new  SalariedEmployeeService();
	
	public static void main(String[] args) {
//		create();
//		deleteById();
//		update();
		findAll();
		
	}
	static void create() {
		SalariedEmployee salariedEmployee = new SalariedEmployee();
		salariedEmployee.setId(001);
		salariedEmployee.setAnnualSalary(100000);
		salariedEmployee.setEmployeeId(1212);
		salariedEmployeeService.create(salariedEmployee);
		
		salariedEmployee.setId(002);
		salariedEmployee.setAnnualSalary(110000);
		salariedEmployee.setEmployeeId(1313);
		salariedEmployeeService.create(salariedEmployee);
		
		salariedEmployee.setId(003);
		salariedEmployee.setAnnualSalary(120000);
		salariedEmployee.setEmployeeId(1414);
		salariedEmployeeService.create(salariedEmployee);
		
		salariedEmployeeService.connectionClose();
	}
	
	
	static void deleteById() {
		salariedEmployeeService.deleteById(003);
		
	}
	
	static void update() {
		SalariedEmployee salariedEmployee = new SalariedEmployee();
		salariedEmployee.setId(1);
		salariedEmployee.setAnnualSalary(500000);
		salariedEmployee.setEmployeeId(1212);
		
		salariedEmployeeService.update(salariedEmployee);
		salariedEmployeeService.connectionClose();
	}
	
	static void findAll(){
		System.out.println(salariedEmployeeService.getAll());
	}
}
