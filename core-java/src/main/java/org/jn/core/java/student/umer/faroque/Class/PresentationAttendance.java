package org.jn.core.java.student.umer.faroque.Class;

public class PresentationAttendance {
	private int ticketId;
	private int presentationId;
	private int attendeeId;
	
	//setters
	public void setTicketId(int ticketId)
	{
		this.ticketId=ticketId;
	}
	public void setPresentationId(int presentationId)
	{
		this.presentationId=presentationId;
	}
	public void setAttendeeId(int attendeeId)
	{
		this.attendeeId=attendeeId;
	}
	
	//getters
	public int getTicketId()
	{
		return ticketId;
	}
	public int getpresentationId() {
		return presentationId;
	}
	public int getattendeeId() {
		return attendeeId;
	}
}
