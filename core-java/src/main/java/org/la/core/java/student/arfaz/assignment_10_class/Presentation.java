package org.la.core.java.student.arfaz.assignment_10_class;

public class Presentation {

	private String  startTime, endTime;
	private int presentationId, bookedCompanyId, bookedRoomId;
	
	public void setpresentationId(int presentationId) {
		this.presentationId=presentationId;
	}
	public int getPresentationId() {
		return presentationId;
	}
	public void setbookedCompanyId(int bookedCompanyId) {
		this.bookedCompanyId=bookedCompanyId;
	}
	public int getbookedCompanyId() {
		return bookedCompanyId;
	}
	public void setbookedRoomId(int bookedRoomId) {
		this.bookedRoomId=bookedRoomId;
	}
	public int getbookedRoomId() {
		return bookedRoomId;
	}
	public void setstartTime(String startTime) {
		this.startTime=startTime;
	}
	public String getstartTime() {
		return startTime;
	}
	public void setendTime(String endTime) {
		this.endTime=endTime;
	}
	public String getendTime() {
		return endTime;
	}

}
