package org.jn.core.java.student.shoaeeb.jdbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.jawed.jdbc.service.UserService;
import org.jn.core.java.student.shoaeeb.jdbc.dto.AttendeeDto;
import org.jn.core.java.student.shoaeeb.jdbc.model.Attendee;
import org.jn.core.java.student.shoaeeb.jdbc.service.AttendeeService;

import com.google.gson.Gson;

public class AttendeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AttendeeController ac = new AttendeeController();
		//ac.getAttendeeByName();
		//ac.createAttendee();
		//ac.updateAttendee();
		ac.findAttendeeById();
	}
	
	void getAttendeeByName() {
		String name = "Shoaeeb";
		AttendeeService as = new AttendeeService();
		List<Attendee> attendeeList = new ArrayList<>();
		attendeeList = as.getAttendeeByName(name);

		print(attendeeList);
	}
	
	void createAttendee() {
		AttendeeDto attendeeDto = new AttendeeDto();
		attendeeDto.setAttendeeId(5);
		attendeeDto.setFirstName("Malika");
		attendeeDto.setLastName("Hussain");
		attendeeDto.setEmail("husain@gmail.com");
		attendeeDto.setPhone("9456795325");
		attendeeDto.setVip("Vip");
		Gson gson = new Gson();
		String json = gson.toJson(attendeeDto);
		Attendee attendee = gson.fromJson(json, Attendee.class);
		AttendeeService attendeeService = new AttendeeService();
		attendeeService.createAttendee(attendee);
		AttendeeDto  attendeeDto2 = new AttendeeDto();
		attendeeDto2 = gson.fromJson(gson.toJson(attendee), AttendeeDto.class);
		print(attendeeDto2);
		
		
	}
	
	void updateAttendee() {
		AttendeeDto attendeeDto = new AttendeeDto();
		attendeeDto.setAttendeeId(1);
		attendeeDto.setFirstName("Milad");
		attendeeDto.setLastName("Ahmed");
		attendeeDto.setPhone("9874659823");
		attendeeDto.setEmail("ahmed@gmail.com");
		attendeeDto.setVip("Vip");
		AttendeeService service = new AttendeeService();
		Gson gson  = new Gson();
		String json= gson.toJson(attendeeDto);
		Attendee attendee = gson.fromJson(json, Attendee.class);
		service.updateAttendee(attendee);
		
	}
	
	void findAttendeeById() {
		int id = 5;
		AttendeeService service = new AttendeeService();
		Attendee attendee =  service.findAttendeeById(id);
		Gson gson = new Gson();
		String json = gson.toJson(attendee);
		AttendeeDto attendeeDto = gson.fromJson(json, AttendeeDto.class);
		print(attendeeDto);
	}
	
	void deleteUser() {
		int id = 1;
		AttendeeService service = new AttendeeService();
		int res = service.deleteAttendee(1);
		System.out.println("res: "+res);
		
	}
	
	void print(List<Attendee> attendeeList)
	{
		attendeeList.forEach(System.out::println);
	}
	void print(AttendeeDto attendeeDto)
	{
		System.out.println(attendeeDto);
	}
	

}
