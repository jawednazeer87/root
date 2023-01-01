package org.jn.core.java.jawed.clss;

import java.util.Date;

public class Presentation {
	
	private int presentationId;
	private int bookedCompanyId;
	private int bookedRoomId;
	private Date startTime;
	private Date endTime;
	
	
	public Presentation(int presentationId, int bookedCompanyId, 
			int bookedRoomId, Date startTime, Date endTime) {
		this.presentationId = presentationId;
		this.bookedCompanyId = bookedCompanyId;
		this.bookedRoomId = bookedRoomId;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
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
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	@Override
	public String toString() {
		return "{ \n\tpresentationId: "+presentationId
				+", \n\tbookedCompanyId: "+bookedCompanyId
				+", \n\tbookedRoomId: "+bookedRoomId
				+", \n\tstartTime: "+startTime
				+", \n\tendTime: "+endTime
				+" \n}";
	}
	
	
}
