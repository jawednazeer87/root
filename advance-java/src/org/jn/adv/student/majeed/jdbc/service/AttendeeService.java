package org.jn.adv.student.majeed.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.majeed.jdbc.model.Attendee;
import org.jn.adv.student.majeed.jdbc.repository.AttendeeRepository;
import org.jn.adv.student.majeed.jdbc.util.GetSqlConnection;

public class AttendeeService 
{
	private Connection con = null;
	
	public AttendeeService()
	{
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose()
	{
		GetSqlConnection.connectionClose();
	}
	
	public List<Attendee> getAll(){
		List<Attendee> attendeeList = new ArrayList<>();
		if(con!=null) {
			attendeeList = AttendeeRepository.getAll(con);
		}
		return attendeeList;
	}
	
	public Attendee findById(int attendeeId){
		
		Attendee attendee = null;
		
		if(con!=null) {
			attendee = AttendeeRepository.findById(con, attendeeId);
		}
		
		return attendee;
	}
	
	public Attendee deleteById(int attendeeId) {
		Attendee attendee = null;
		
		if(con!=null) {
		 attendee = AttendeeRepository.deleteById(con, attendeeId);
		}
		return attendee;
	}
	
	public void create(Attendee attendee) {
		AttendeeRepository.create(con, attendee);
	}
	
	public void update(Attendee attendee) {
		AttendeeRepository.update(con, attendee);
	}

	public List<Attendee> getByName(String firstName) {
		return AttendeeRepository.getByFirstName(con, firstName);
	}
}
