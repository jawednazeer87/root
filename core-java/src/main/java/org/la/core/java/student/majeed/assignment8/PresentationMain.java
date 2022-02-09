package org.la.core.java.student.majeed.assignment8;

/*
	2.	Create a class Presentation having member variables presentationId, bookedCompanyId, bookedRoomId, 
	startTime, endTime. Create getters and setters for all member variables. 
	Create object of Presentation class in other class inside main method and set all member values 
	and print all member values using getters.
 */

public class PresentationMain {
	public static void main(String[] args) {
		Presentation presentation = new Presentation();
		
		presentation.setPresentationId(1001);
		presentation.setBookedCompanyId(201);
		presentation.setBookedRoomId(10);
		presentation.setStartTime("09:00 AM");
		presentation.setEndTime("11:00 AM");
		
		System.out.println("Presentation Id: "+presentation.getPresentationId());
		System.out.println("Booked Company Id: "+presentation.getBookedCompanyId());
		System.out.println("Booked Room Id: "+presentation.getBookedRoomId());
		System.out.println("Start Time: "+presentation.getStartTime());
		System.out.println("End Time: "+presentation.getEndTime());
	}

}
