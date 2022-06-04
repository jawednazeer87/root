package org.jn.adv.student.tanseer.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.Countries;
import org.jn.adv.student.tanseer.jdbc.repository.CountriesRepository;
import org.jn.adv.student.tanseer.jdbc.util.GetSqlConnection;

public class CountriesService 
{
private Connection con = null;
	
	public CountriesService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose()
	{
		GetSqlConnection.connectionClose();
	}
	
	public int deleteById(int id) {
		return CountriesRepository.deleteById(con, id );
	}
	
	public void create(Countries countries) {
		CountriesRepository.create(con, countries);
	}
	
	public void update(Countries countries) {
		CountriesRepository.update(con, countries);
	}
	
	public List<Countries> getAll(){
		List<Countries> countriesList = new ArrayList<>();
		if(con!=null) {
			countriesList = CountriesRepository.getAll(con);
		}
		return countriesList;
	}
}
