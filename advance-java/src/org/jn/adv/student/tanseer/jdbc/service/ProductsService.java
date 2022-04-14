package org.jn.adv.student.tanseer.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.Products;
import org.jn.adv.student.tanseer.jdbc.repository.ProductsRepository;
import org.jn.adv.student.tanseer.jdbc.util.GetSqlConnection;

public class ProductsService 
{
	private Connection con = null;
	
	public ProductsService() 
	{
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose()
	{
		GetSqlConnection.connectionClose();
	}
	
	public void create(Products products)
	{
		ProductsRepository.create(con, products);
	}
	
	public List<Products> getAll()
	{
		List<Products> productsList = new ArrayList<>();
		if(con != null)
		{
			productsList =  ProductsRepository.getAll(con);
		}
		return productsList;
	}
}
