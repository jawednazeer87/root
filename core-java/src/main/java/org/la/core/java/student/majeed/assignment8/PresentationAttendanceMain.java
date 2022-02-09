package org.la.core.java.student.majeed.assignment8;

/*
	5.	Create a class PresentationAttendance having member variables ticketId, presentationId, attendeeId. 
	create getters and setters for all member variables. Create object of PresentationAttendance 
	class in other class inside main method and set all member values and print all member values using getters.
 */

public class PresentationAttendanceMain {
	
	public static void main(String[] args) {
		PresentationAttendance presentationAttendance = new PresentationAttendance();
		
		presentationAttendance.setTicketId(888);
		presentationAttendance.setPresentationId(1);
		presentationAttendance.setAttendeeId(20);
		
		System.out.println("ticketId : "+presentationAttendance.getTicketId());
		System.out.println("presentationId : "+presentationAttendance.getPresentationId());
		System.out.println("attendeeId : "+presentationAttendance.getAttendeeId());	
		
	}
	
}
