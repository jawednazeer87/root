package org.la.core.java.student.nizaam.jdbc.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Presentation {

	private int presentation_id;
	private int booked_company_id;
	private int booked_room_id;
	private Timestamp start_time;
	private Timestamp end_time;
	
	Presentation(){}
	public Presentation(int presentationId, int bookedCompanyId, int bookedRoomId, Timestamp startTime, Timestamp endTime ){
		this.presentation_id = presentationId;
		this.booked_company_id = bookedCompanyId;
		this.booked_room_id = bookedRoomId;
		this.start_time = startTime;
		this.end_time = endTime;
	}
	public int getPresentation_id() {
		return presentation_id;
	}
	public void setPresentation_id(int presentation_id) {
		this.presentation_id = presentation_id;
	}
	public int getBooked_company_id() {
		return booked_company_id;
	}
	public void setBooked_company_id(int booked_company_id) {
		this.booked_company_id = booked_company_id;
	}
	public int getBooked_room_id() {
		return booked_room_id;
	}
	public void setBooked_room_id(int booked_room_id) {
		this.booked_room_id = booked_room_id;
	}
	public Timestamp getStart_time() {
		return start_time;
	}
	public void setStart_time(Timestamp start_time) {
		this.start_time = start_time;
	}
	public Timestamp getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Timestamp end_time) {
		this.end_time = end_time;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Presentation{" +
        "presentationid=" + presentation_id +
        ", bookedCompanyId='" + booked_company_id + '\'' +
        ", bookedRoomId='" + booked_room_id + '\'' +
        ", startTime = '" + start_time + '\''+
        ", endTime = '" + end_time + '\''+
       
        '}';
	}
}
