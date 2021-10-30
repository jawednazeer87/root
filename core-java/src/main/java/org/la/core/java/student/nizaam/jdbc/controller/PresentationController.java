package org.la.core.java.student.nizaam.jdbc.controller;



import org.la.core.java.student.nizaam.jdbc.service.PresentationService;

public class PresentationController {

	public static void main(String[] args) {

		PresentationService ps = new PresentationService();
		try {
			//ps.createPresentation(3, 2,startTime , endTime);
			System.out.println(ps.findById(2));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
