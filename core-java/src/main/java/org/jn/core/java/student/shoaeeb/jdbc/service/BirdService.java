package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Bird;
import org.jn.core.java.student.shoaeeb.jdbc.repository.BirdRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

public class BirdService {
	
	private static Connection con = null;
	public BirdService() {
	con = GetSqlConnection.getConnection();
	}
	
	public List<Bird> getAllBird()
	{
		List<Bird> list = BirdRepository.getAllBird(con);
		return list;
	}
	
	public int updateBirdById(Bird bird) {
		
		
		
		int count = BirdRepository.updateBirdById(con, bird);
		
		return count;
	}
	
	public int deleteBirdbById(int id)
	{
		int count = BirdRepository.deleteBirdbById(con, id);
		return count;
	}
	
	
}
