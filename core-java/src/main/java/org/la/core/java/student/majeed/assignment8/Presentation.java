package org.la.core.java.student.majeed.assignment8;

/*
	2.	Create a class Presentation having member variables presentationId, bookedCompanyId, bookedRoomId, 
	startTime, endTime. Create getters and setters for all member variables. 
	Create object of Presentation class in other class inside main method and set all member values 
	and print all member values using getters.
 */

public class Presentation {
	private int presentationId;
	private int bookedCompanyId; 
	private int bookedRoomId; 
	private String startTime; 
	private String endTime;
	
	public int getPresentationId() {
		return presentationId;
	}
	public void setPresentationId(int presentationId) {
		this.presentationId = presentationId;
	}
	public int getBookedCompanyId() {
		return bookedCompanyId;
	}
	public void setBookedCompanyId(int bookedCompanyId) {
		this.bookedCompanyId = bookedCompanyId;
	}
	public int getBookedRoomId() {
		return bookedRoomId;
	}
	public void setBookedRoomId(int bookedRoomId) {
		this.bookedRoomId = bookedRoomId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}	

}
