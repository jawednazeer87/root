package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class PresentationAttendance {
	
	int ticketId; 
	int presentationId;
	int attendeeId;
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getPresentationId() {
		return presentationId;
	}
	public void setPresentationId(int presentationId) {
		this.presentationId = presentationId;
	}
	public int getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(int attendeeId) {
		this.attendeeId = attendeeId;
	}
	
	@Override
	public String toString() {
		return "PresentationAttendance [ticketId=" + ticketId + ", presentationId=" + presentationId + ", attendeeId="
				+ attendeeId + "]";
	}
	
	
}
