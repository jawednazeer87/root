package org.la.core.java.student.nizaam.jdbc.controller;



import java.sql.Timestamp;
import java.time.LocalDate;

import org.la.core.java.student.nizaam.jdbc.service.PresentationService;

public class PresentationController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PresentationService ps = new PresentationService();
		Timestamp startTime = new Timestamp(1234590);
		Timestamp endTime = new Timestamp(133890);
		try {
			//ps.createPresentation(3, 2,startTime , endTime);
			System.out.println(ps.findById(2));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
