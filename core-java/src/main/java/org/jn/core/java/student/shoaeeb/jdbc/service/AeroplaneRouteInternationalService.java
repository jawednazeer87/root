package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.AeroplaneRouteInternational;
import org.jn.core.java.student.shoaeeb.jdbc.repository.AeroplaneRouteInternationalRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

public class AeroplaneRouteInternationalService {

	public  static Connection con = null;
	public AeroplaneRouteInternationalService() {
		con = GetSqlConnection.getConnection();
	}
	
	public List<AeroplaneRouteInternational> getALlAeroplane()
	{
		List<AeroplaneRouteInternational> list = AeroplaneRouteInternationalRepository.getAllAeroplane(con);
		return list;
	}
	public AeroplaneRouteInternational findAeroplaneRoute(int id)
	{
		AeroplaneRouteInternational aeroplane = AeroplaneRouteInternationalRepository.findAeroplaneRoute(con, id);
		
		return aeroplane;	
	}
	public int updateAeroplane(AeroplaneRouteInternational aeroplane)
	{
		int count = AeroplaneRouteInternationalRepository.updateAeroplane(con, aeroplane);
		return count;
	}
	
}
