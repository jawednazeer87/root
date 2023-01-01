package org.jn.core.java.student.shoaeeb.clss;

public class PresentationAttendanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PresentationAttendance pr = new PresentationAttendance();
		pr.setTicketId(12);
		pr.setPresentationId(23);
		pr.setAttendeeId(5);
		
		System.out.println("TicketId: "+pr.getTicketId()+" Presentation Id: "+pr.getpresentationId()+ " Attendee Id "+pr.getattendeeId());

	}

}
