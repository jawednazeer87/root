package org.la.core.java.student.tanseer.assignment8.classes;

public class PresentationMain 
{
	
	public static void main(String[] args) 
	{
		Presentation presentation = new Presentation();
		presentation.setPresentationId(11);
		presentation.setBookedCompanyId(1100);
		presentation.setBookedRoomId(101);
		presentation.setStartTime(55);
		presentation.setEndTime(65);
		
		System.out.println("presentationId\t :"+presentation.getPresentationId());
		System.out.println("bookedCompanyId\t :"+presentation.getBookedCompanyId());
		System.out.println("bookedRoomId\t :"+presentation.getBookedRoomId());
		System.out.println("startTime\t :"+presentation.getStartTime());
		System.out.println("endTime\t\t :"+presentation.getEndTime());
		
	}
}
