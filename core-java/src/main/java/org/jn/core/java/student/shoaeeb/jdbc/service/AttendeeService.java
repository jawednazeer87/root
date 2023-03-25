package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Attendee;
import org.jn.core.java.student.shoaeeb.jdbc.repository.AttendeeRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

public class AttendeeService {
	
	private Connection con = null;
	public AttendeeService() {
		con = GetSqlConnection.getConnection();
	}
	
	public List<Attendee> getAllAttendee() {
		List<Attendee> attendeeList = new ArrayList<>();
		attendeeList = AttendeeRepository.getAllAttendee(con);
		return attendeeList;
	}
	public Attendee findAttendeeById(int id)
	{
		Attendee attendee = new Attendee();
		attendee = AttendeeRepository.findAttendeeById(con, id);
		return attendee;	
	}
	public void createAttendee(Attendee attendee) {
		AttendeeRepository.createAttendee(con, attendee);
	}
	public void updateAttendee(Attendee attendee)
	{
		AttendeeRepository.updateAttendee(con, attendee);
		
	}
	public int deleteAttendee(int id)
	{
		return AttendeeRepository.deleteAttendee(con, id);
	}
	
	public List<Attendee> getAttendeeByName(String name)
	{
		List<Attendee> attendeeList = new ArrayList<>();
		attendeeList =  AttendeeRepository.getAttendeeByName(con, name);
		return attendeeList;
		
	}
	
}
