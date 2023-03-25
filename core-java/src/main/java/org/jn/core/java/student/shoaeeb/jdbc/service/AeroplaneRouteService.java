package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.AeroplaneRouteDomestic;
import org.jn.core.java.student.shoaeeb.jdbc.repository.AeroplaneRouteDomesticRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

public class AeroplaneRouteService {
	private Connection con = null;
	public AeroplaneRouteService() {
		con =  GetSqlConnection.getConnection();
	}
	public List<AeroplaneRouteDomestic> getAllAeroplaneRoutes(){
		List<AeroplaneRouteDomestic> list = new ArrayList<>();
		list = AeroplaneRouteDomesticRepository.getAllAeroplaneRoutes(con);
		return list;
	}
	
	public AeroplaneRouteDomestic findById(int id)
	{
		AeroplaneRouteDomestic aeroplaneRoute = AeroplaneRouteDomesticRepository.getById(con, id);
		return aeroplaneRoute;
	}
	public int  updateAeroplaneRoute(AeroplaneRouteDomestic aeroplane)
	{
		return AeroplaneRouteDomesticRepository.updateAeroplaneRoute(con, aeroplane);
	}
	
	public int deleteById(Connection con,int id)
	{
		return AeroplaneRouteDomesticRepository.deleteById(con, id);
	}
	
	public List<AeroplaneRouteDomestic> getByName(String name) {
		List<AeroplaneRouteDomestic> list = AeroplaneRouteDomesticRepository.getByName(con, name);
		return list;
	}
	 
	
}
