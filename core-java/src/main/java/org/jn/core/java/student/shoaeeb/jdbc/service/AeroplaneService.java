package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Aeroplane;
import org.jn.core.java.student.shoaeeb.jdbc.repository.AeroplaneRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

public class AeroplaneService {

	private Connection con = null;
	public AeroplaneService() {
		 con = GetSqlConnection.getConnection();
		
	}
	public  List<Aeroplane> getAeroplaneByName(String name)
	{
		List<Aeroplane> list = new ArrayList<>();
		list = AeroplaneRepository.getAeroplaneByName(con, name);
		return list;
	}
	public  int deleteAttendee(int id)
	{
		int count = 0;
		count = AeroplaneRepository.deleteAeroplane(con,id);
		return count;		
	}
	public  void updateAeroplane(Aeroplane aeroplane)
	{
		AeroplaneRepository.updateAttendee(con, aeroplane);
	}
	
	public  Aeroplane findAeroplaneById(int id)
	{
		Aeroplane aeroplane = AeroplaneRepository.findAeroplanebyId(con, id);
		return aeroplane;
	}
	
	public  List<Aeroplane> getAllAttendee()
	{
		List<Aeroplane> list = new ArrayList<>();
		list = AeroplaneRepository.getAllAeroplane(con);
		return list;
	}
}
