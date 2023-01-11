package org.jn.core.java.student.shoaeeb.absclss;

public class PresentationAttendanceAbsClassImpl extends PresentationAttendanceAbsClass {

	@Override
	public void setTicketId(int ticketId) {
		// TODO Auto-generated method stub
		this.tickedId=ticketId;
	}

	@Override
	public void setPresentationId(int presentationId) {
		// TODO Auto-generated method stub
		this.presentationId=presentationId;
	}

	@Override
	public void setAttendeeId(int attendeeId) {
		// TODO Auto-generated method stub
		this.attendeeId=attendeeId;
	}

	@Override
	public int getTicketId() {
		// TODO Auto-generated method stub
		return this.tickedId; 
	}

	@Override
	public int getPresentationId() {
		// TODO Auto-generated method stub
		return this.presentationId;
	}

	@Override
	public int getAttendeeId() {
		// TODO Auto-generated method stub
		return this.attendeeId;
	}

}
