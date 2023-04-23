package org.jn.corejava.student.aameen.clss;

import java.util.Date;

public class Presentation {
	
	private int presentationId;
	private int bookCompanyId;
	private int bookRoomId;
	private Date startTime;
	private Date endTime;
	
	
	public Presentation(int presentationId, int bookCompanyId, 
			int bookRoomId, Date startTime, Date endTime) {
		
		this.presentationId = presentationId;
		this.bookCompanyId = bookCompanyId;
		this.bookRoomId = bookRoomId;
		this.startTime = startTime;
		this.endTime = endTime;
	}
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
	
	public void print()
	{
		System.out.println("presentationId:"+presentationId);
		System.out.println("bookCompanyId:"+bookCompanyId);
		System.out.println("bookRoomId:"+bookRoomId);
		System.out.println("startTime:"+startTime);
		System.out.println("endTime:"+endTime);
	}
	
	
	
}
