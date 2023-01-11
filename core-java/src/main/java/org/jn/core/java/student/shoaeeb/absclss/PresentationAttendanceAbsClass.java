package org.jn.core.java.student.shoaeeb.absclss;

public abstract class PresentationAttendanceAbsClass {
	int tickedId;
	int presentationId;
	int attendeeId;
	
	//setters
	public abstract void setTicketId(int ticketId);
	public abstract void setPresentationId(int presenationId);
	public abstract void setAttendeeId(int attendeeId);
	
	//getters
	public abstract int getTicketId();
	public abstract int getPresentationId();
	public abstract int getAttendeeId();
}
