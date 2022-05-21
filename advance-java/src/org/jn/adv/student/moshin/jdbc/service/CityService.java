package org.jn.adv.student.moshin.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.model.City;
import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.repository.CityRepository;
import org.jn.adv.student.moshin.jdbc.repository.EmployeeRepository;
import org.jn.adv.student.moshin.jdbc.util.GetSqlConnectionStudentDB;

public class CityService {

private Connection con = null;
	
	public CityService() {
		con = GetSqlConnectionStudentDB.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnectionStudentDB.connectionClose();
	}
	
	public List<City> getAll(){
		List<City> cityList = new ArrayList<>();
		if(con!=null) {
			cityList = CityRepository.getAll(con);
		}
		return cityList;
	}
	
	public City findById(int id){
		
		City city = null;
		
		if(con!=null) {
			city = CityRepository.findById(con, id);
		}
		
		return city;
	}
	
	public int deleteById(int cityId) {
		return CityRepository.deleteById(con, cityId);
	}
	
	public void create(City city) {
		CityRepository.create(con, city);
	}
	
	public void update(City city) {
		CityRepository.update(con, city);
	}

	public List<City> getByID(String id) {
		return CityRepository.getByID(con, id);
	}
	public List<City> getByDobRange(LocalDate startDate, LocalDate endDate) {
		return CityRepository.getByDobRange(con, startDate, endDate);
	}
	
}
