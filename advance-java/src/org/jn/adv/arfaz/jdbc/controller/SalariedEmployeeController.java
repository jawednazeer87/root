package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.util.GSONGenericUtil;
import org.jn.adv.arfaz.jdbc.model.SalariedEmployee;
import org.jn.adv.arfaz.jdbc.model.SalariedEmployee;
import org.jn.adv.arfaz.jdbc.service.SalariedEmployeeService;

public class SalariedEmployeeController {
//	sal_emp ( sal_emp_id, floor_num, seat_capacity )
	// after invoking constructor. It will connect with database and show msg connected
	static SalariedEmployeeService sal_empService = new SalariedEmployeeService();
		public static void main(String[] args) {
//			create();
//			updateOpera();
//			getById(5);
			findAll();
//			deleteOpera();
			
			
		}
		
//		create database and insert into table create operation
//	id, annual_salary, employee_id )
		static void create() {
			SalariedEmployee sal_emp = new SalariedEmployee();
			sal_emp.setId(2);
			sal_emp.setAnnual_salary(500000);
//			name, description, primary_contact_attendee_id
			sal_emp.setEmployee_id(2144634);
			sal_empService.create(sal_emp);
			sal_empService.connectionClose();
		}

		// read operation		
		static void getById(int i)  {
			System.out.println(sal_empService.findById(i));	
		}
//		read operation
		static void findAll(){
			System.out.println(sal_empService.getAll());
		}
		
//		delete operation
		static void deleteOpera() {
			sal_empService.deleteById(1);
		}
//		update the row or column
		static void updateOpera() {
			SalariedEmployee sal_emp = new SalariedEmployee();
			sal_emp.setId(1);
			sal_emp.setEmployee_id(18);
//			name, description, primary_contact_attendee_id
			sal_emp.setAnnual_salary(650000);
			
			sal_empService.update(sal_emp);
			sal_empService.connectionClose();

			
		}
//		static List<SalariedEmployeeDTO> getAll() {
//			List<SalariedEmployee> SalariedEmployeeList = SalariedEmployeeService.getAll();
//			SalariedEmployeeService.connectionClose();
//			final List<SalariedEmployeeDTO> dtoList = new ArrayList<>();
//			SalariedEmployeeList.stream().forEach(SalariedEmployee-> {
//				SalariedEmployeeDTO dto = GSONGenericUtil.map(SalariedEmployee, SalariedEmployeeDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<SalariedEmployeeDTO> getByDobRange() {
//			List<SalariedEmployee> SalariedEmployeeList = SalariedEmployeeService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			SalariedEmployeeService.connectionClose();
//			List<SalariedEmployeeDTO> dtoList = GSONGenericUtil.mapList(SalariedEmployeeList, SalariedEmployeeDTO.class);
//			return dtoList;
//		}
		
		
	}
