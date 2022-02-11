package org.la.core.java.student.moshin.assignment8;

import org.la.core.java.student.moshin.assignment8.Presentation1;

public class Presentation1main {
	public static void main(String[] args) {
		Presentation1 presentation = new Presentation1();
		
		presentation.setPresentationId(501);
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
