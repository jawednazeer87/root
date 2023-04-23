package org.jn.corejava.student.aameen.clss;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PresentationMain {

	public static void main(String[] args) {
		// 
		int presentationId = 1;
		int bookCompanyId = 2;
		int bookRoomId = 3;
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String dateString ="11-04-2023 11:00:10";
		
		Date startTime = null;
		Date endTime=null;
		
		try {
			startTime = dateFormat.parse(dateString);
			dateString = "15-04-2023 10:30:02"; 
			endTime = dateFormat.parse(dateString);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		Presentation presentation = new Presentation(presentationId,bookCompanyId,
				bookRoomId,startTime,endTime);
		presentation.print();
	}

}
