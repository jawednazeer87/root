package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Categories;
import org.jn.adv.arfaz.jdbc.repository.CategoriesRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class CategoriesService {
private Connection con = null;
	
	public CategoriesService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Categories> getAll(){
		List<Categories> CategoriesList = new ArrayList<>();
		if(con!=null) {
			CategoriesList = CategoriesRepository.getAll(con);
		}
		return CategoriesList;
	}
	
	public Categories findById(int id){
		
		Categories room = null;
		
		if(con!=null) {
			room = CategoriesRepository.findById(con, id);
		}
		
		return room;
	}
	
	public int deleteById(int roomId) {
		return CategoriesRepository.deleteById(con, roomId);
	}
	
	public void create(Categories room) {
		CategoriesRepository.create(con, room);
	}
	
	public void update(Categories room) {
		CategoriesRepository.update(con, room);
	}

//	public List<Categories> getByName(String firstName) {
//		return CategoriesRepository.getByFirstName(con, firstName);
//	}
//	public List<Categories> getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return CategoriesRepository.getByDobRange(con, startDate, endDate);
//	}
	
}