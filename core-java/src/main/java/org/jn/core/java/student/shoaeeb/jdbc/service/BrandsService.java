package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Brands;
import org.jn.core.java.student.shoaeeb.jdbc.repository.BrandsRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

public class BrandsService {
	private static Connection con = null;
	public BrandsService() {
		con=GetSqlConnection.getConnection();
	}
	public List<Brands> getAllBrands() {
		List<Brands> list = BrandsRepository.getAllBrands(con);
		return list;
	}
	
	public int updateById(Brands brands)
	{
		int count = BrandsRepository.updateById(con, brands);
		return count;
		
	}
	
	public Brands findById(int id)
	{
		Brands brands=BrandsRepository.findById(con, id);
		return brands;
	}
}
