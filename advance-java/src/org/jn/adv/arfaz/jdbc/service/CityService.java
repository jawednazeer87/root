package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.City;
import org.jn.adv.arfaz.jdbc.repository.CityRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class CityService {
private Connection con = null;
	
	public CityService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<City> getAll(){
		List<City> CityList = new ArrayList<>();
		if(con!=null) {
			CityList = CityRepository.getAll(con);
		}
		return CityList;
	}
	
	public City findById(int id){
		
		City sal_emp = null;
		
		if(con!=null) {
			sal_emp = CityRepository.findById(con, id);
		}
		
		return sal_emp;
	}
	
	public int deleteById(int employee_id ) {
		return CityRepository.deleteById(con, employee_id );
	}
	
	public void create(City sal_emp) {
		CityRepository.create(con, sal_emp);
	}
	
	public void update(City sal_emp) {
		CityRepository.update(con, sal_emp);
	}

//	public List<City> getByName(String firstName) {
//		return CityRepository.getByFirstName(con, firstName);
//	}
//	public List<City> getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return CityRepository.getByDobRange(con, startDate, endDate);
//	}
	
}