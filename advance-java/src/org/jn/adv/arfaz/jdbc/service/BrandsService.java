package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Brands;
import org.jn.adv.arfaz.jdbc.repository.BrandsRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class BrandsService {
private Connection con = null;
	
	public BrandsService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Brands> getAll(){
		List<Brands> BrandsList = new ArrayList<>();
		if(con!=null) {
			BrandsList = BrandsRepository.getAll(con);
		}
		return BrandsList;
	}
	
	public Brands findById(int id){
		
		Brands room = null;
		
		if(con!=null) {
			room = BrandsRepository.findById(con, id);
		}
		
		return room;
	}
	
	public int deleteById(int roomId) {
		return BrandsRepository.deleteById(con, roomId);
	}
	
	public void create(Brands room) {
		BrandsRepository.create(con, room);
	}
	
	public void update(Brands room) {
		BrandsRepository.update(con, room);
	}

//	public List<Brands> getByName(String firstName) {
//		return BrandsRepository.getByFirstName(con, firstName);
//	}
//	public List<Brands> getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return BrandsRepository.getByDobRange(con, startDate, endDate);
//	}
	
}