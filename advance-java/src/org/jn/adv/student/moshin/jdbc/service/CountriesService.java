package org.jn.adv.student.moshin.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.model.Countries;
import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.repository.CountriesRepository;
import org.jn.adv.student.moshin.jdbc.repository.EmployeeRepository;
import org.jn.adv.student.moshin.jdbc.util.GetSqlConnectionStudentDB;

public class CountriesService {

private Connection con = null;
	
	public CountriesService() {
		con = GetSqlConnectionStudentDB.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnectionStudentDB.connectionClose();
	}
	
	public List<Countries> getAll(){
		List<Countries> countriesList = new ArrayList<>();
		if(con!=null) {
			countriesList = CountriesRepository.getAll(con);
		}
		return countriesList;
	}
	
	public Countries findById(int id){
		
		Countries countries = null;
		
		if(con!=null) {
			countries = CountriesRepository.findById(con, id);
		}
		
		return countries;
	}
	
	public int deleteById(int employeeId) {
		return CountriesRepository.deleteById(con, employeeId);
	}
	
	public void create(Countries countries) {
		CountriesRepository.create(con, countries);
	}
	
	public void update(Countries countries) {
		CountriesRepository.update(con, countries);
	}

	public List<Countries> getByName(String firstName) {
		return CountriesRepository.getByFirstName(con, firstName);
	}
	public List<Countries> getByDobRange(LocalDate startDate, LocalDate endDate) {
		return CountriesRepository.getByDobRange(con, startDate, endDate);
	}
	
}
