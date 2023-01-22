package org.jn.core.java.student.mirza.baig.clss.object;

public class PresentationAttendance {

	private int ticketId;
	private int presentationId;
	private int attendeeId;
	
	
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
	
	
	
}

//Create a class PresentationAttendance having member variables ticketId, 
//presentationId, attendeeId. create getters and setters for all member variables. Create object of PresentationAttendance class 
//in other class inside main method and set all member values and print all member values using getters.