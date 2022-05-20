	package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.util.GSONGenericUtil;
import org.jn.adv.arfaz.jdbc.model.HourlyEmployee;
import org.jn.adv.arfaz.jdbc.model.HourlyEmployee;
import org.jn.adv.arfaz.jdbc.service.HourlyEmployeeService;

public class HourlyEmployeeController {
//	hourly_employee ( id, hourly_rate, employee_id )
	// after invoking constructor. It will connect with database and show msg connected
	static HourlyEmployeeService rempService = new HourlyEmployeeService();
		public static void main(String[] args) {
//			create();
//			updateOpera();
//			getById(1);
			findAll();
//			deleteOpera();
			
			
		}
		
//		create database and insert into table create operation
//		remp ( id, remp )		
		static void create() {
			HourlyEmployee remp = new HourlyEmployee();
			remp.setId(2);
//			name, description, primary_contact_attendee_id
			remp.setHourly_rate(280);
			remp.setEmployee_id(2235678);
			
			rempService.create(remp);
			rempService.connectionClose();
		}

		// read operation		
		static void getById(int i)  {
			System.out.println(rempService.findById(i));	
		}
//		read operation
		static void findAll(){
			System.out.println(rempService.getAll());
		}
		
//		delete operation
		static void deleteOpera() {
			rempService.deleteById(1);
		}
//		update the row or column
		static void updateOpera() {
			HourlyEmployee remp = new HourlyEmployee();
			remp.setId(1);
			remp.setHourly_rate(300);
			remp.setEmployee_id(225678);

//			name, description, primary_contact_attendee_id
			
			rempService.update(remp);
			rempService.connectionClose();

			
		}
//		static List<HourlyEmployeeDTO> getAll() {
//			List<HourlyEmployee> HourlyEmployeeList = HourlyEmployeeService.getAll();
//			HourlyEmployeeService.connectionClose();
//			final List<HourlyEmployeeDTO> dtoList = new ArrayList<>();
//			HourlyEmployeeList.stream().forEach(HourlyEmployee-> {
//				HourlyEmployeeDTO dto = GSONGenericUtil.map(HourlyEmployee, HourlyEmployeeDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<HourlyEmployeeDTO> getByDobRange() {
//			List<HourlyEmployee> HourlyEmployeeList = HourlyEmployeeService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			HourlyEmployeeService.connectionClose();
//			List<HourlyEmployeeDTO> dtoList = GSONGenericUtil.mapList(HourlyEmployeeList, HourlyEmployeeDTO.class);
//			return dtoList;
//		}
		
		
	}
