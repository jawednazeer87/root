package org.jn.core.java.student.shoaeeb.absclss;

public abstract class PresentationAbsClass {
	int presentationId;
	int bookedCompanyId;
	int bookedRoomId;
	
	public abstract void setPresentationId(int presentationId);
	public abstract void setBookedCompanyId(int bookedCompanyId);
	public abstract void setBookedRoomId(int bookedRoomId);
	
	public abstract int getPresentationId();
	public abstract int getBookedCompanyId();
	public abstract int getBookedRoomId();
}
