package org.jn.adv.student.moshin.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.dto.EmployeeDTO;
import org.jn.adv.student.moshin.jdbc.dto.Presentation_attendanceDTO;
import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.model.Presentation_attendance;
import org.jn.adv.student.moshin.jdbc.service.EmployeeService;
import org.jn.adv.student.moshin.jdbc.service.Presentation_attendanceService;
import org.jn.adv.student.moshin.jdbc.util.GSONGenericUtil;

public class Presentation_attendanceController {
		static Presentation_attendanceService presentation_attendanceService = new Presentation_attendanceService();
		public static void main(String[] args) {
			create();
//			Presentation_attendanceDTO dto = GSONGenericUtil.map(getAll().get(5), Presentation_attendanceDTO.class);
//			System.out.println(dto);
//			getAll().stream().forEach(System.out::println);
//			getByDobRange().stream().forEach(System.out::println);
		}
		
		static void create() {
			Presentation_attendance presentation_attendance = new Presentation_attendance();
			presentation_attendance.setTicket_id(1);
			presentation_attendance.setPresentation_id(123);
			presentation_attendance.setAttendee_id(159);
			presentation_attendanceService.create(presentation_attendance);
			Presentation_attendance.connectionClose();
		}
		
		static List<Presentation_attendanceDTO> getAll() {
			List<Presentation_attendance> presentation_attendanceList = presentation_attendanceService.getAll();
			Presentation_attendanceService.connectionClose();
			final List<Presentation_attendanceDTO> dtoList = new ArrayList<>();
			presentation_attendanceList.stream().forEach(presentation_attendance-> {
				Presentation_attendanceDTO dto = GSONGenericUtil.map(presentation_attendance, Presentation_attendanceDTO.class);
				dtoList.add(dto);
			});
			return dtoList;
		}
		
		static List<Presentation_attendanceDTO> getByDobRange() {
			List<Presentation_attendance> presentation_attendanceList = presentation_attendanceService.getByDobRange(LocalDate.of(1979, 01, 10), 
																		LocalDate.of(2021, 01, 10));
			presentation_attendanceService.connectionClose();
			List<Presentation_attendanceDTO> dtoList = GSONGenericUtil.mapList(presentation_attendanceList, Presentation_attendanceDTO.class);
			return dtoList;
		}

}
