package org.jn.adv.student.majeed.jdbc.service;

/**
* @author AbdulMajeed
*
*/

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.majeed.jdbc.model.Presentation;
import org.jn.adv.student.majeed.jdbc.repository.PresentationRepository;
import org.jn.adv.student.majeed.jdbc.util.GetSqlConnection;

public class PresentationService {
	
private Connection con = null;
	
	public PresentationService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
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
	
	public int deleteById(int presentationId) {
		return PresentationRepository.deleteById(con, presentationId);
	}
	
	public void create(Presentation presentation) {
		PresentationRepository.create(con, presentation);
	}
	
	public void update(Presentation presentation) {
		PresentationRepository.update(con, presentation);
	}
	
}
