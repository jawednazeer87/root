package org.jn.core.java.student.mirza.baig.clss.object;

import java.sql.Time;

public class Presentation {

	private int presentationId;
	private int bookCompanyId;
	private int bookRoomId;
	private  Time starTime;
	private Time endTime;
	public int getPresentationId() {
		return presentationId;
	}
	public void setPresentationId(int presentationId) {
		this.presentationId = presentationId;
	}
	public int getBookCompanyId() {
		return bookCompanyId;
	}
	public void setBookCompanyId(int bookCompanyId) {
		this.bookCompanyId = bookCompanyId;
	}
	public int getBookRoomId() {
		return bookRoomId;
	}
	public void setBookRoomId(int bookRoomId) {
		this.bookRoomId = bookRoomId;
	
	}
	public Time getStarTime() {
		return starTime;
	}
	public void setStarTime(Time starTime) {
		this.starTime = starTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	
	
	
	
}















// Create a class Presentation having member variables presentationId, bookedCompanyId, bookedRoomId, startTime, endTime. 
//Create getters and setters for all member variables. Create object of Presentation class in other class inside main 
//method and set all member values and print all member values using getters.