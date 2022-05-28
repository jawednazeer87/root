package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.RelationTable;
import org.jn.adv.arfaz.jdbc.model.RelationTable;
import org.jn.adv.arfaz.jdbc.repository.RelationTableRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class RelationTableService {
private Connection con = null;
	
	public RelationTableService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<RelationTable> getAll(){
		List<RelationTable> RelationTableList = new ArrayList<>();
		if(con!=null) {
			RelationTableList = RelationTableRepository.getAll(con);
		}
		return RelationTableList;
	}
	
	public RelationTable findById(int id){
		
		RelationTable room = null;
		
		if(con!=null) {
			room = RelationTableRepository.findById(con, id);
		}
		
		return room;
	}
	
	public int deleteById(int roomId) {
		return RelationTableRepository.deleteById(con, roomId);
	}
	
	public void create(RelationTable attendee) {
		RelationTableRepository.create(con, attendee);
	}
	
	public void update(RelationTable room) {
		RelationTableRepository.update(con, room);
	}

//	public List<RelationTable> getByName(String firstName) {
//		return RelationTableRepository.getByFirstName(con, firstName);
//	}
//	public List<RelationTable> getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return RelationTableRepository.getByDobRange(con, startDate, endDate);
//	}
	
}