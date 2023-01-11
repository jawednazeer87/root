package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class PresentationAttendanceMain {

	public static void main(String[] args) {
		
		PresentationAttendance presentationAttendance = new PresentationAttendance();
		presentationAttendance.setAttendeeId(1);
		presentationAttendance.setPresentationId(2);
		presentationAttendance.setTicketId(3);
		
		System.out.println(presentationAttendance.toString());
	}

}
