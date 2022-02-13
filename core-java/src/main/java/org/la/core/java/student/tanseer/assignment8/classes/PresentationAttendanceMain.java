package org.la.core.java.student.tanseer.assignment8.classes;

public class PresentationAttendanceMain 
{
	public static void main(String[] args) 
	{
		PresentationAttendance presentationAttendance = new PresentationAttendance();
		presentationAttendance.setTicketId(121);
		presentationAttendance.setPresentationId(100);
		presentationAttendance.setAttendeeId(777);
		
		System.out.println("ticketId :  "+presentationAttendance.getTickedId());
		System.out.println("presentationId  :  "+presentationAttendance.getPresentationId());
		System.out.println("attendeeId  : "+presentationAttendance.getAttendeeId());
	}
}
