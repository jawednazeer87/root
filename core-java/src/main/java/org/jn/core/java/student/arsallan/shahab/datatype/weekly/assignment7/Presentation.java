package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment7;

public class Presentation {

	int presentationId;
	int bookedCompanyId;
	int bookedRoomId;
	
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
	public void print() {
		System.out.println("presentationId: "+this.presentationId+", bookedCompanyId: "+this.bookedCompanyId+", bookedRoomId: "+this.bookedRoomId);
	}
	
}
