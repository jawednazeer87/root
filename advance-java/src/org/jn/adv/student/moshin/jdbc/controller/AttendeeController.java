package org.jn.adv.student.moshin.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.dto.AttendeeDTO;
import org.jn.adv.student.moshin.jdbc.model.Attendee;
import org.jn.adv.student.moshin.jdbc.service.AttendeeService;
import org.jn.adv.student.moshin.jdbc.util.GSONGenericUtil;

public class AttendeeController {
		static AttendeeService attendeeService = new AttendeeService();
		public static void main(String[] args) {
			create();
//			AttendeeDTO dto = GSONGenericUtil.map(getAll().get(5), AttendeeDTO.class);
//			System.out.println(dto);
//			getAll().stream().forEach(System.out::println);
//			getByDobRange().stream().forEach(System.out::println);
		}
		
		static void create() {
			Attendee attendee = new Attendee();
			attendee.setAttendee_id(1);
			attendee.setFirstName("moshin");
			attendee.setLastName("ansari");
			attendee.setPhone(987548125);
			attendee.setEmail("ansari@48752");
			attendee.setVip(548);

			attendeeService.create(attendee);
			attendeeService.connectionClose();
		}
		
		static List<AttendeeDTO> getAll() {
			List<Attendee> attendeeList = attendeeService.getAll();
			attendeeService.connectionClose();
			final List<AttendeeDTO> dtoList = new ArrayList<>();
			attendeeList.stream().forEach(attendee-> {
				AttendeeDTO dto = GSONGenericUtil.map(attendee, AttendeeDTO.class);
				dtoList.add(dto);
			});
			return dtoList;
		}
	

}
