package org.la.core.java.student.nizaam.jdbc.service;

import java.sql.Timestamp;


import org.la.core.java.student.nizaam.jdbc.model.Presentation;
import org.la.core.java.student.nizaam.jdbc.repository.PresentationRepository;

public class PresentationService {

	PresentationRepository pr = new PresentationRepository();
	
	public void createPresentation(int bookedCompanyId, int bookedRoomId, Timestamp startTime, Timestamp endTime) throws Exception {
		pr.createPresentation(bookedCompanyId, bookedRoomId, startTime, endTime);
	}
	
	public Presentation findById(int presentationId) throws Exception {
		return pr.findById(presentationId);
	}
}
