package org.la.core.java.student.datatype.Sahil;

import java.util.Date;

public class h2Presentation {

	 int presentationId;
	 int bookedCompanyId;
	 int BookedRoomId;
	 Date expiry;
		
	void setters(int  presentationId ,int bookedCompanyId , int BookedRoomId, Date ex ) {
		
	 presentationId = 25;
	 bookedCompanyId = 354;
	 BookedRoomId =12459;
	 Date expiry = ex;
	 	}
	void display() {
	System.out.println("presentationId : " + presentationId);
	System.out.println("bookedCompanyId : "+ bookedCompanyId);
	System.out.println("BookedRoomId : "+ BookedRoomId);
	System.out.println("expiry"+expiry);
	}
	
}
