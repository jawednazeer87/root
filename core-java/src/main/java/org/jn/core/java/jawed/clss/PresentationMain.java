package org.jn.core.java.jawed.clss;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PresentationMain {

	public static void main(String[] args) {
		int presentationId = 1;
		int bookedCompanyId = 2;
		int bookedRoomId = 44;
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String dateString = "03-01-2023 10:30:20";
		Date startTime = null;
		Date endTime = null;
		try {
			startTime = dateFormat.parse(dateString);
			dateString = "20-01-2025  05:45:10";
			endTime = dateFormat.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Presentation presentation = new Presentation(presentationId, bookedCompanyId,
				bookedRoomId, startTime, endTime);
		System.out.println(presentation);
	}
}
