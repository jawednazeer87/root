package org.jn.adv.student.moshin.jdbc.model;

import java.time.LocalDate;

public class Presentation {


	private Integer presentation_id;
	private Integer booked_company_id;
	private Integer booked_room_id;
	private LocalDate start_time;
	private LocalDate end_time;
	

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
	 * @return the booked_company_id
	 */
	public Integer getBooked_company_id() {
		return booked_company_id;
	}

	/**
	 * @param booked_company_id the booked_company_id to set
	 */
	public void setBooked_company_id(Integer booked_company_id) {
		this.booked_company_id = booked_company_id;
	}

	

	/**
	 * @return the booked_room_id
	 */
	public Integer getBooked_room_id() {
		return booked_room_id;
	}

	/**
	 * @param booked_room_id the booked_room_id to set
	 */
	public void setBooked_room_id(Integer booked_room_id) {
		this.booked_room_id = booked_room_id;
	}


	
		/**
	 * @return the start_time
	 */
	public LocalDate getStart_time() {
		return start_time;
	}

	/**
	 * @param start_time the start_time to set
	 */
	public void setStart_time(LocalDate start_time) {
		this.start_time = start_time;
	}

	
	/**
	 * @return the end_time
	 */
	public LocalDate getend_time() {
		return end_time;
	}

	/**
	 * @param end_time the end_time to set
	 */
	public void setEnd_time(LocalDate end_time) {
		this.end_time = end_time;
	}


	@Override
	public String toString() {
		return "{presentation_id: "+presentation_id+", booked_company_id: "+booked_company_id+", booked_room_id: "+booked_room_id+", start_time: "+start_time+ ", end_time: "+end_time+"}";
	}

}

