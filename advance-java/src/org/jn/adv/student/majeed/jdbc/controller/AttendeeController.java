package org.jn.adv.student.majeed.jdbc.controller;


import org.jn.adv.student.majeed.jdbc.model.Attendee;
import org.jn.adv.student.majeed.jdbc.dto.AttendeeDTO;
import org.jn.adv.student.majeed.jdbc.service.AttendeeService;
import org.jn.adv.student.majeed.jdbc.util.GSONGenericUtil;

import java.util.List;
import java.util.ArrayList;

/**
* @author AbdulMajeed
*
*/

public class AttendeeController 
{
	static AttendeeService attendeeService = new AttendeeService();
	
	public static void main(String[] args) 
	{
		//create();				
		
		//getAll().stream().forEach(System.out::println);
//		System.out.println();
		
		//findById();
		//deleteById();
//		findById();
		//getAlls();

	}
	
	static void create() 
	{
		Attendee attendee = new Attendee();
		attendee.setAttendeeId(2);
		attendee.setFirstName("Abdul Majeed");
		attendee.setLastName("Mohammed");
		attendee.setPhone("987654321");
		attendee.setEmail("majeed1@gmail.com"); 	
		attendee.setVip(1);		
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

	static List<Attendee> getAlls(){
		List<Attendee> attendeeList= attendeeService.getAll();
		System.out.println(attendeeList);
		attendeeService.connectionClose();
		return attendeeList;
	
	}
	
	static void deleteById() {
		Attendee attendee = new Attendee();
		attendee = attendeeService.deleteById(2);
		System.out.println(attendee);
	}
	
	static void findById() {
		Attendee attendee = new Attendee();
	attendee= attendeeService.findById(2);
		System.out.println(attendee);
		attendeeService.connectionClose();
	}
	
}
