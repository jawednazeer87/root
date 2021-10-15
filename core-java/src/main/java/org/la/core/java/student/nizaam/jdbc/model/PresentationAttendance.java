package org.la.core.java.student.nizaam.jdbc.model;

public class PresentationAttendance {

	private int ticket_id;
	private int presentation_id;
	private int attendee_id;
	
	PresentationAttendance(){}
	PresentationAttendance(int ticketId, int presentationId, int attendeeId){
		this.ticket_id = ticketId;
		this.presentation_id = presentationId;
		this.attendee_id = attendeeId;
	}
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	public int getPresentation_id() {
		return presentation_id;
	}
	public void setPresentation_id(int presentation_id) {
		this.presentation_id = presentation_id;
	}
	public int getAttendee_id() {
		return attendee_id;
	}
	public void setAttendee_id(int attendee_id) {
		this.attendee_id = attendee_id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PresentaitonAttendance{" +
        "ticketId=" + ticket_id +
        ", presentationId='" + presentation_id + '\'' +
        ", attendeeId='" + attendee_id + '\'' +
        
        '}';
	}
}
