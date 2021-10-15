package org.la.core.java.student.nizaam.jdbc.service;

import org.la.core.java.student.nizaam.jdbc.model.Attendee;
import org.la.core.java.student.nizaam.jdbc.repository.AttendeeRepository;

public class AttendeeService {

	AttendeeRepository ar = new AttendeeRepository();
	
	public void createAttendee(String firstName, String lastName, int phone, String email, boolean vip) throws Exception {
		
		ar.createAttendee(firstName, lastName, phone, email, vip);
	}
	
	public Attendee findById(int attendeeId) throws Exception {
		return ar.findById(attendeeId);
	}
}
