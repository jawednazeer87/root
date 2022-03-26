package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.jdbc.dto.EmployeeDTO;
import org.jn.adv.arfaz.jdbc.model.Employee;
import org.jn.adv.arfaz.jdbc.service.EmployeeService;
import org.jn.adv.jawed.jdbc.util.GSONGenericUtil;

public class EmployeeController {

	static EmployeeService employeeService = new EmployeeService();
		public static void main(String[] args) {
			//create();
			//EmployeeDTO dto = GSONGenericUtil.map(getAll().get(5), EmployeeDTO.class);
			//System.out.println(dto);
			//getAll().stream().forEach(System.out::println);
			getByDobRange().stream().forEach(System.out::println);
		}
		
		static void create() {
			Employee employee = new Employee();
			employee.setCompanyId(1);
			employee.setFirstName("anita");
			employee.setLastName("sarin");
			LocalDate localDate = LocalDate.of(1985, 07, 21);
			employee.setDob(localDate);
			employee.setSalary(90000.0);
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
		
		static List<EmployeeDTO> getByDobRange() {
			List<Employee> employeeList = employeeService.getByDobRange(LocalDate.of(1979, 01, 10), 
																		LocalDate.of(2021, 01, 10));
			employeeService.connectionClose();
			List<EmployeeDTO> dtoList = GSONGenericUtil.mapList(employeeList, EmployeeDTO.class);
			return dtoList;
		}
		
		
	}
