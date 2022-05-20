package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Countries;
import org.jn.adv.arfaz.jdbc.repository.CountriesRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class CountriesService {
private Connection con = null;
	
	public CountriesService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Countries> getAll(){
		List<Countries> CountriesList = new ArrayList<>();
		if(con!=null) {
			CountriesList = CountriesRepository.getAll(con);
		}
		return CountriesList;
	}
	
	public Countries findById(int id){
		
		Countries room = null;
		
		if(con!=null) {
			room = CountriesRepository.findById(con, id);
		}
		
		return room;
	}
	
	public int deleteById(int roomId) {
		return CountriesRepository.deleteById(con, roomId);
	}
	
	public void create(Countries room) {
		CountriesRepository.create(con, room);
	}
	
	public void update(Countries room) {
		CountriesRepository.update(con, room);
	}

//	public List<Countries> getByName(String firstName) {
//		return CountriesRepository.getByFirstName(con, firstName);
//	}
//	public List<Countries> getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return CountriesRepository.getByDobRange(con, startDate, endDate);
//	}
	
}