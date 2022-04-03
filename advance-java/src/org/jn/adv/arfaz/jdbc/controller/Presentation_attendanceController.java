package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Presentation_attendance;
import org.jn.adv.arfaz.jdbc.service.Presentation_attendanceService;

public class Presentation_attendanceController {

	// after invoking constructor. It will connect with database and show msg connected
	static Presentation_attendanceService attendanceService = new Presentation_attendanceService();
		public static void main(String[] args) {
//			create();
//			updateOpera();
//			getById(31);
			findAll();
//			deleteOpera();
			
			//Presentation_attendanceServiceDTO dto = GSONGenericUtil.map(getAll().get(5), Presentation_attendanceServiceDTO.class);
			//System.out.println(dto);
			//getAll().stream().forEach(System.out::println);
			
//			getByDobRange().stream().forEach(System.out::println);
		}
		
//		create database and insert into table create operation
		static void create() {
			Presentation_attendance attendance = new Presentation_attendance();
//			ticket_id,presentation_id,attendee_id
			attendance.setTicket_id(31);
			attendance.setPresentation_id(801);
			attendance.setAttendee_id(541209);
			attendanceService.create(attendance);
			attendanceService.connectionClose();
		}

		// read operation		
		static void getById(int i)  {
			System.out.println(attendanceService.findById(i));	
		}
//		read operation
		static void findAll(){
			System.out.println(attendanceService.getAll());
		}
		
//		delete operation
		static void deleteOpera() {
			attendanceService.deleteById(1);
		}
//		update the row or column
		static void updateOpera() {
			Presentation_attendance attendance = new Presentation_attendance();
			attendance.setTicket_id(31);
			attendance.setPresentation_id(2153);
//			name, description, primary_contact_attendance_id
			attendance.setAttendee_id (1234);
			attendanceService.update(attendance);
			attendanceService.connectionClose();

			
		}
//		static List<Presentation_attendanceServiceDTO> getAll() {
//			List<Presentation_attendanceService> Presentation_attendanceServiceList = attendanceService.getAll();
//			attendanceService.connectionClose();
//			final List<Presentation_attendanceServiceDTO> dtoList = new ArrayList<>();
//			Presentation_attendanceServiceList.stream().forEach(Presentation_attendanceService-> {
//				Presentation_attendanceServiceDTO dto = GSONGenericUtil.map(Presentation_attendanceService, Presentation_attendanceServiceDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<Presentation_attendanceServiceDTO> getByDobRange() {
//			List<Presentation_attendanceService> Presentation_attendanceServiceList = attendanceService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			attendanceService.connectionClose();
//			List<Presentation_attendanceServiceDTO> dtoList = GSONGenericUtil.mapList(Presentation_attendanceServiceList, Presentation_attendanceServiceDTO.class);
//			return dtoList;
//		}
		
		
	}
