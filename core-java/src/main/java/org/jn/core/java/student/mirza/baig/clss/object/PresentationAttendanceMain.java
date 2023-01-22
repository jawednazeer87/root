package org.jn.core.java.student.mirza.baig.clss.object;

public class PresentationAttendanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PresentationAttendance pa= new PresentationAttendance();
		pa.setTicketId(102);
		pa.setPresentationId(01);
		pa.setAttendeeId(1234);
		
		System.out.println("TicketId :"+pa.getTicketId());
		System.out.println("PresentationId :"+pa.getPresentationId());
		System.out.println("AttenndeeId :"+pa.getAttendeeId());
	}

}
