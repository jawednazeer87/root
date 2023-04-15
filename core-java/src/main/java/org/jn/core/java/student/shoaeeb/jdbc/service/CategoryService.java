package org.jn.core.java.student.shoaeeb.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.core.java.student.shoaeeb.jdbc.model.Categorys;
import org.jn.core.java.student.shoaeeb.jdbc.repository.CategorysRepository;
import org.jn.core.java.student.shoaeeb.jdbc.util.GetSqlConnection;

public class CategoryService {
	public static Connection con =null;
	public CategoryService() {
		con = GetSqlConnection.getConnection();
	}
	public List<Categorys> getAllCategorys() {
		List<Categorys> list = new ArrayList<>();
		list = CategorysRepository.getAllCategorys(con);
		return list;
		
	}
	public int createCategory(Categorys categorys)
	{
		int count=0;
		count=CategorysRepository.createCategory(con, categorys);
		return count;
		
	}
}
