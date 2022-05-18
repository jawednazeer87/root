package org.jn.adv.student.moshin.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.model.Presentation;
import org.jn.adv.student.moshin.jdbc.repository.PresentationRepository;
import org.jn.adv.student.moshin.jdbc.util.GetSqlConnectionStudentDB;

public class PresentationService {


private Connection con = null;
	
	public PresentationService() {
		con = GetSqlConnectionStudentDB.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnectionStudentDB.connectionClose();
	}
	
	public List<Presentation> getAll(){
		List<Presentation> presentationList = new ArrayList<>();
		if(con!=null) {
			presentationList = PresentationRepository.getAll(con);
		}
		return presentationList;
	}
	
	public Presentation findById(int id){
		
		Presentation presentation = null;
		
		if(con!=null) {
			presentation = PresentationRepository.findById(con, id);
		}
		
		return presentation;
	}
	
	public int deleteById(int presentation_id) {
		return PresentationRepository.deleteById(con, presentation_id);
	}
	
	public void create(Presentation presentation) {
		PresentationRepository.create(con, presentation);
	}
	
	public void update(Presentation presentation) {
		PresentationRepository.update(con, presentation);
	}

	public List<Presentation> getByDobRange(LocalDate startDate, LocalDate endDate) {
		return PresentationRepository.getByDobRange(con, startDate, endDate);
	}
	
}
