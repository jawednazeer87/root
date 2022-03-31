package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.util.GSONGenericUtil;
import org.jn.adv.arfaz.jdbc.model.Attendee;
import org.jn.adv.arfaz.jdbc.service.AttendeeService;

public class AttendeeController {

	// after invoking constructor. It will connect with database and show msg connected
	static AttendeeService attendeeService = new AttendeeService();
		public static void main(String[] args) {
//			create();
//			updateOpera();
//			getById(1);
			findAll();
//			deleteOpera();
			
			//AttendeeServiceDTO dto = GSONGenericUtil.map(getAll().get(5), AttendeeServiceDTO.class);
			//System.out.println(dto);
			//getAll().stream().forEach(System.out::println);
			
//			getByDobRange().stream().forEach(System.out::println);
		}
		
//		create database and insert into table create operation
		static void create() {
			Attendee attendee = new Attendee();
			attendee.setAttendee_id(1);
			attendee.setFirst_name("arfaz");
//			name, description, primary_contact_attendee_id
			attendee.setLast_name("mohammad");
			attendee.setPhone("+9112345679");
			attendee.setEmail("mohammad@gmail.com");
			attendee.setVip(true);
			attendeeService.create(attendee);
			attendeeService.connectionClose();
		}

		// read operation		
		static void getById(int i)  {
			System.out.println(attendeeService.findById(i));	
		}
//		read operation
		static void findAll(){
			System.out.println(attendeeService.getAll());
		}
		
//		delete operation
		static void deleteOpera() {
			attendeeService.deleteById(1);
		}
//		update the row or column
		static void updateOpera() {
			Attendee attendee = new Attendee();
			attendee.setAttendee_id(3);
			attendee.setFirst_name("shagufa");
//			name, description, primary_contact_attendee_id
			attendee.setLast_name("shaik");
			attendee.setPhone("+9176809101");
			attendee.setEmail("shagufa@gmail.com");
			attendee.setVip(true);
			attendeeService.update(attendee);
			attendeeService.connectionClose();

			
		}
//		static List<AttendeeServiceDTO> getAll() {
//			List<AttendeeService> AttendeeServiceList = attendeeService.getAll();
//			attendeeService.connectionClose();
//			final List<AttendeeServiceDTO> dtoList = new ArrayList<>();
//			AttendeeServiceList.stream().forEach(AttendeeService-> {
//				AttendeeServiceDTO dto = GSONGenericUtil.map(AttendeeService, AttendeeServiceDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<AttendeeServiceDTO> getByDobRange() {
//			List<AttendeeService> AttendeeServiceList = attendeeService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			attendeeService.connectionClose();
//			List<AttendeeServiceDTO> dtoList = GSONGenericUtil.mapList(AttendeeServiceList, AttendeeServiceDTO.class);
//			return dtoList;
//		}
		
		
	}
