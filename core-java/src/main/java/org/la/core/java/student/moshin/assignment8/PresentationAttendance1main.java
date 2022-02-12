package org.la.core.java.student.moshin.assignment8;

public class PresentationAttendance1main {
	
	public static void main(String[] args) {
		PresentationAttendance1 Attendence = new PresentationAttendance1();
		
		Attendence.setTicketID(15);
		Attendence.setPresentationid(554);
		Attendence.setAttendeeId(58714);
		
		
		System.out.println("Ticket ID: "+Attendence.getTicketID());
		System.out.println("Presentation ID: "+Attendence.getPresentationid());
		System.out.println("Attendee ID: "+Attendence.getAttendeeId());	
				
		}
}
	
	