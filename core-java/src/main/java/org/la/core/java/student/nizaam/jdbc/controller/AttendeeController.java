package org.la.core.java.student.nizaam.jdbc.controller;

import org.la.core.java.student.nizaam.jdbc.service.AttendeeService;

public class AttendeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AttendeeService as = new AttendeeService();
		
		try {
			//as.createAttendee("Nizaam", "Shaik", 80507368, "nizaam.s.m@gmail.com", false);
			//as.createAttendee("Shaik", "Sha", 123456, "nizaam.s.m@gmail.com", true);
			
			System.out.println(as.findById(2).toString());
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
				
	}

}
