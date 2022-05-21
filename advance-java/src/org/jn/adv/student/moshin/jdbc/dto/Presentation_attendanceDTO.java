package org.jn.adv.student.moshin.jdbc.dto;

public class Presentation_attendanceDTO {
	private Integer ticket_id;
	private Integer presentation_id;
	private Integer attendee_id;
	
	/**
	 * @return the ticket_id
	 */
	public Integer getTicket_id() {
		return ticket_id;
	}

	/**
	 * @param ticket_id the ticket_id to set
	 */
	public void setTicket_id(Integer ticket_id) {
		this.ticket_id = ticket_id;
	}

	/**
	 * @return the presentation_id
	 */
	public Integer getPresentation_id() {
		return presentation_id;
	}

	/**
	 * @param presentation_id the presentation_id to set
	 */
	public void setPresentation_id(Integer presentation_id) {
		this.presentation_id = presentation_id;
	}

	
	/**
	 * @return the attendee_id
	 */
	public Integer getAttendee_id() {
		return attendee_id;
	}

	/**
	 * @param attendee_id the attendee_id to set
	 */
	public void setAttendee_id(Integer attendee_id) {
		this.attendee_id = attendee_id;
	}

	@Override
	public String toString() {
		
		return "{ticket_id: "+ticket_id+", presentation_id: "+presentation_id+", attendee_id: "+attendee_id+"}";
	}
}