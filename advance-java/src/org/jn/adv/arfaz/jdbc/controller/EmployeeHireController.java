package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.EmployeeHire;
import org.jn.adv.arfaz.jdbc.service.EmployeeHireService;

public class EmployeeHireController {
	// after invoking constructor. It will connect with database and show msg connected
	static EmployeeHireService employeehireService = new EmployeeHireService();
		public static void main(String[] args) {
//			create();
			//EmployeeDTO dto = GSONGenericUtil.map(getAll().get(5), EmployeeDTO.class);
			//System.out.println(dto);
//			getById(1);
						findAll();
//			updateOpera();
//			deleteOpera();

			//			getByDobRange().stream().forEach(System.out::println);
		}
//		06. employeehire ( id, employee_name, employee_num, date_hired, city_id )
		static void create() {
			EmployeeHire employee = new EmployeeHire();
			employee.setId(31);
			employee.setEmployee_name("anita");
			employee.setEmployee_num(7680922);
			LocalDate date_hired = LocalDate.of(2022, 04, 6);

			employee.setDate_hired(date_hired);
			employee.setCity_id(123456);
		
			employeehireService.create(employee);
			employeehireService.connectionClose();
		}
		static void findAll(){
			System.out.println(employeehireService.getAll());
		}
//		delete operation
		static void deleteOpera() {
			employeehireService.deleteById(1);
		}
//		update the row or column
		static void updateOpera() {
			EmployeeHire employee = new EmployeeHire();
			employee.setId(31);
			employee.setEmployee_name("Arfaz");
//			name, description, primary_contact_employee_id
			employee.setEmployee_num (123456789);
			employee.setCity_id(516150);

			LocalDate date_hired = LocalDate.of(2020, 03, 3);
			employee.setDate_hired(date_hired);

			
			employeehireService.update(employee);
			employeehireService.connectionClose();
//			id, employee_name, employee_num, date_hired, city_id 
			
		}
		static void getById(int i)  {
			System.out.println(employeehireService.findById(i));	
		}
		

//		static List<EmployeeDTO> getAll() {
//			List<Employee> employeeList = employeehireService.getAll();
//			employeehireService.connectionClose();
//			final List<EmployeeDTO> dtoList = new ArrayList<>();
//			employeeList.stream().forEach(employee-> {
//				EmployeeDTO dto = GSONGenericUtil.map(employee, EmployeeDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<EmployeeDTO> getByDobRange() {
//			List<Employee> employeeList = employeehireService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			employeehireService.connectionClose();
//			List<EmployeeDTO> dtoList = GSONGenericUtil.mapList(employeeList, EmployeeDTO.class);
//			return dtoList;
//		}
//		
		
	}
