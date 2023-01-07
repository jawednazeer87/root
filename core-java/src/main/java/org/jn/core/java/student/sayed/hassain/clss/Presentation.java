package org.jn.core.java.student.sayed.hassain.clss;

public class Presentation {
	int presentationId;
	int bookedCompanyId;
	int bookedRoomId;
    int startTime;
    int endTime;
    
    public int getterPresentationId() {
    	return presentationId;
    }
    public int getterBookedCompanyId() {
    	return bookedCompanyId;
    }
    public int getterBookedRoomId() {
    	return bookedRoomId;
    }
    public int getterStartTime() {
    	return startTime;
    }
    public int getterEndTime() {
    	return endTime;
    }
    public void setterPresentationId(int presentationId) {
    	this.presentationId=presentationId;
    }
    public void setterBookedCompanyId(int bookedCompanyId) {
    	this.bookedCompanyId=bookedCompanyId;
    }
    public void setterBookedRoomId(int bookedRoomId) {
    	this.bookedRoomId=bookedRoomId;
    }
    public void setterStartTime(int startTime) {
    	this.startTime=startTime;
    }
    public void setterEndTime(int endTime) {
    	this.endTime=endTime;
    }
}
