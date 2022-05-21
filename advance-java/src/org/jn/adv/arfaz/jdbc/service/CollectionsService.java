package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Collections;
import org.jn.adv.arfaz.jdbc.repository.CollectionsRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class CollectionsService {
private Connection con = null;
	
	public CollectionsService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Collections> getAll(){
		List<Collections> CollectionsList = new ArrayList<>();
		if(con!=null) {
			CollectionsList = CollectionsRepository.getAll(con);
		}
		return CollectionsList;
	}
	
	public Collections findById(int id){
		
		Collections room = null;
		
		if(con!=null) {
			room = CollectionsRepository.findById(con, id);
		}
		
		return room;
	}
	
	public int deleteById(int roomId) {
		return CollectionsRepository.deleteById(con, roomId);
	}
	
	public void create(Collections room) {
		CollectionsRepository.create(con, room);
	}
	
	public void update(Collections room) {
		CollectionsRepository.update(con, room);
	}

//	public List<Collections> getByName(String firstName) {
//		return CollectionsRepository.getByFirstName(con, firstName);
//	}
//	public List<Collections> getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return CollectionsRepository.getByDobRange(con, startDate, endDate);
//	}
	
}