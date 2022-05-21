package org.jn.adv.student.moshin.jdbc.controller;

import java.time.LocalDate;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.dto.AttendeeDTO;
import org.jn.adv.student.moshin.jdbc.model.Attendee;

public class AttendeeController {
		static Attendee attendeeService = new Attendee();
		public static void main(String[] args) {
			create();
//			AttendeeDTO dto = GSONGenericUtil.map(getAll().get(5), AttendeeDTO.class);
//			System.out.println(dto);
//			getAll().stream().forEach(System.out::println);
//			getByDobRange().stream().forEach(System.out::println);
		}
		
		static void create() {
			Attendee attendeee = new Attendee();
			attendeee.setAttendee_id(1);
			attendeee.setFirstName("moshin");
			attendeee.setLastName("ansari");
			attendeee.setPhone(987548125);
			attendeee.setEmail("ansari@48752");
			attendeee.setVip(548);

			attendeeService.create(attendeee);
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
		
		static List<AttendeeDTO> getByDobRange() {
			List<Attendee> attendeeList = attendeeService.getByDobRange(LocalDate.of(1979, 01, 10), 
																		LocalDate.of(2021, 01, 10));
			attendeeService.connectionClose();
			List<AttendeeDTO> dtoList = GSONGenericUtil.mapList(attendeeList, AttendeeDTO.class);
			return dtoList;
		}

}
