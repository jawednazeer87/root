package org.jn.core.java.student.sadullah.weekly.assignment6;

import java.time.*;

public class Presentation {
	
	int presentationId;
	int bookedCompanyId;
	int bookedRoomId;
	int startTime;
	int endTime;
	
	public void setPresId(int presId) {
		this.presentationId = presId;
	}
	
	public void setBcId(int bcId) {
		this.bookedCompanyId = bcId;
	}
	
	public void setBrId(int brId) {
		this.bookedRoomId = brId;
	}
	
	public void setStartTime(int sT) {
		this.startTime = sT;
	}
	
	public void setEndTime(int eT) {
		this.endTime = eT;
	}
	
	public int getPresId() {
		return presentationId;
	}
	
	public int getBcId() {
		return bookedCompanyId;
	}
	
	public int getBrId() {
		return bookedRoomId;
	}
	
	public int setStartTime() {
		return startTime;
	}
	
	public int setEndTime() {
		return endTime;
	}
}
