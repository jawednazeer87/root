package org.jn.core.java.student.naushad.jdbc.controller;

import java.util.List;

import org.jn.core.java.student.naushad.jdbc.model.Attendee;
import org.jn.core.java.student.naushad.jdbc.model.dto.AttendeeDto;
import org.jn.core.java.student.naushad.jdbc.service.AttendeeService;
import org.jn.core.java.student.naushad.jdbc.util.AttendeeUtil;

public class AttendeeController {
	AttendeeService attendeeService = new AttendeeService();

	public static void main(String[] args) {

		AttendeeController attendeeController = new AttendeeController();

		attendeeController.create();
//		attendeeController.update();
//		attendeeController.delete();
//		attendeeController.findById();
//		attendeeController.readAll();
//		attendeeController.findByName();

		System.out.println("All Good");

	}

	void create() {
		Attendee attendee = new Attendee();
		attendee.setAttendee_id(5);
		attendee.setFirst_name("Shamshad");
		attendee.setLast_name("Ahmad");
		attendee.setEamil("shamshadsays@gmail.com");
		attendee.setPhn_no(542136879);
		attendee.setVip(true);

		AttendeeDto attendeeDto = AttendeeUtil.toDtoAuto(attendee);
		attendeeService.create(attendeeDto);

	}

	void update() {
		Attendee attendee = new Attendee();
		attendee.setAttendee_id(1);
		attendee.setFirst_name("SURAJ");
		attendee.setLast_name("KUMAR");
		attendee.setEamil("SURAJSAYSgmail.com");
		attendee.setPhn_no(542136879);
		attendee.setVip(true);

		AttendeeDto attendeeDto = AttendeeUtil.toDtoAuto(attendee);
		attendeeService.update(attendeeDto);
	}

	void delete() {
		int id = 5;
		attendeeService.delete(id);
	}

	void findById() {
		int id = 1;
		AttendeeDto attendeeDto = attendeeService.findById(id);

		System.out.println(attendeeDto.getAttendeeDto_id());
		System.out.println(attendeeDto.getFirst_name());
		System.out.println(attendeeDto.getLast_name());
		System.out.println(attendeeDto.getPhn_no());
		System.out.println(attendeeDto.getEamil());
		System.out.println(attendeeDto.isVip());
	}

	void findByName() {
		String name = "SURAJ";
		List<AttendeeDto> attendeeDtos = attendeeService.findByName(name);
		for (AttendeeDto attendeeDto : attendeeDtos) {
			System.out.println(attendeeDto.getAttendeeDto_id());
			System.out.println(attendeeDto.getFirst_name());
			System.out.println(attendeeDto.getLast_name());
			System.out.println(attendeeDto.getPhn_no());
			System.out.println(attendeeDto.getEamil());
			System.out.println(attendeeDto.isVip());
		}
	}

	void readAll() {
		List<AttendeeDto> attendeeDtos = attendeeService.readAll();
		for (AttendeeDto attendeeDto : attendeeDtos) {
			System.out.println(attendeeDto.getAttendeeDto_id());
			System.out.println(attendeeDto.getFirst_name());
			System.out.println(attendeeDto.getLast_name());
			System.out.println(attendeeDto.getPhn_no());
			System.out.println(attendeeDto.getEamil());
			System.out.println(attendeeDto.isVip());
		}
	}

}
