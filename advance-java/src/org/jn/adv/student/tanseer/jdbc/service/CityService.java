package org.jn.adv.student.tanseer.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.City;
import org.jn.adv.student.tanseer.jdbc.repository.CityRepository;
import org.jn.adv.student.tanseer.jdbc.util.GetSqlConnection;

public class CityService 
{
private Connection con = null;
	
	public CityService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose()
	{
		GetSqlConnection.connectionClose();
	}
	
	public int deleteById(int id) {
		return CityRepository.deleteById(con, id );
	}
	
	public void create(City city) {
		CityRepository.create(con, city);
	}
	
	public void update(City city) {
		CityRepository.update(con, city);
	}
	
	public List<City> getAll(){
		List<City> cityList = new ArrayList<>();
		if(con!=null) {
			cityList = CityRepository.getAll(con);
		}
		return cityList;
	}
}
