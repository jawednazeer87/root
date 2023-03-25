package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Bread;
import org.jn.core.java.student.shoaeeb.jdbc.repository.BreadRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

public class BreadService {
	private static Connection con=null;
	public BreadService() {
		con=GetSqlConnection.getConnection();
	}
	
	public List<Bread> getAllBread() {
		List<Bread> list = new ArrayList<>();
		list = BreadRepository.getAllBread(con);
		return list;
	}
	
	public Bread findBreadById(int id) {
		Bread bread = new Bread();
		bread=BreadRepository.findBreadById(con, id);
		return bread;
	}
	public int createBread(Bread bread) {
		int count = BreadRepository.createBread(con, bread);
		return count;
	}
	
	public int updateBreadById(Bread bread) {
		int count=BreadRepository.updateBreadById(con, bread);
		return count;
	}
}
