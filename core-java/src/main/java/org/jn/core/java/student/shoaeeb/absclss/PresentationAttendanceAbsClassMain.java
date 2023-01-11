package org.jn.core.java.student.shoaeeb.absclss;

public class PresentationAttendanceAbsClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PresentationAttendanceAbsClass abs = new PresentationAttendanceAbsClassImpl();
		abs.setTicketId(1);
		abs.setPresentationId(5);
		abs.setAttendeeId(6);
		System.out.println(abs.getTicketId()+" "+abs.presentationId+ " "+ abs.getAttendeeId());
	}

}
