package org.jn.core.java.student.sayed.hassain.clss;

public class PresentationAttendanceMain {
	
	public static void main(String[] args) {
		
		PresentationAttendance presentationAttendance=new PresentationAttendance();
		
		presentationAttendance.setterTicketId(1001);
		System.out.println(presentationAttendance.getterticketId());
		
		presentationAttendance.setterPresentationId(1020);
		System.out.println(presentationAttendance.getterPresentationId());
		
		presentationAttendance.setterAttendeeId(100020);
		System.out.println(presentationAttendance.getterAttendeeId());
	}

}
