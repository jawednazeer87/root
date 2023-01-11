package org.jn.core.java.student.shoaeeb.absclss;

public class PresentationAbsClassImpl extends PresentationAbsClass {
	
	@Override
	public void setPresentationId(int presentationId)
	{
		this.presentationId=presentationId;
	}

	@Override
	public void setBookedCompanyId(int bookedCompanyId) {
		// TODO Auto-generated method stub
		this.bookedCompanyId=bookedCompanyId;
		
	}

	@Override
	public void setBookedRoomId(int bookedRoomId) {
		// TODO Auto-generated method stub
		this.bookedCompanyId=bookedRoomId;
		
	}

	@Override
	public int getPresentationId() {
		// TODO Auto-generated method stub
		return this.presentationId;
		
	}

	@Override
	public int getBookedCompanyId() {
		// TODO Auto-generated method stub
		return this.bookedCompanyId;
	}

	@Override
	public int getBookedRoomId() {
		// TODO Auto-generated method stub
		return this.bookedRoomId;
	}
	
}
