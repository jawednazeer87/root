package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Products ;
import org.jn.adv.arfaz.jdbc.repository.ProductsRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class ProductsService {
private Connection con = null;
	
	public ProductsService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Products > getAll(){
		List<Products > ProductsList = new ArrayList<>();
		if(con!=null) {
			ProductsList = ProductsRepository.getAll(con);
		}
		return ProductsList;
	}
	
	public Products  findById(int id){
		
		Products  sal_emp = null;
		
		if(con!=null) {
			sal_emp = ProductsRepository.findById(con, id);
		}
		
		return sal_emp;
	}
	
	public int deleteById(int employee_id ) {
		return ProductsRepository.deleteById(con, employee_id );
	}
	
	public void create(Products  sal_emp) {
		ProductsRepository.create(con, sal_emp);
	}
	
	public void update(Products  sal_emp) {
		ProductsRepository.update(con, sal_emp);
	}

//	public List<Products > getByName(String firstName) {
//		return Products Repository.getByFirstName(con, firstName);
//	}
//	public List<Products > getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return Products Repository.getByDobRange(con, startDate, endDate);
//	}
	
}