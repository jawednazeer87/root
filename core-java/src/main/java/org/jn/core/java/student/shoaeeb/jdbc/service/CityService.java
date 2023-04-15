package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.City;
import org.jn.core.java.student.shoaeeb.jdbc.repository.CityRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

public class CityService {
	public static Connection con=null;
	public CityService() {
		con=GetSqlConnection.getConnection();
	}
	
	public List<City> getAllCity() {
		List<City> list = new ArrayList<>();
		list = CityRepository.getAllCity(con);
		return list;
		
	}
}
