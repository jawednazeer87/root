package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.OrderItems;
import org.jn.adv.arfaz.jdbc.repository.OrderItemsRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class OrderItemsService {
private Connection con = null;
	
	public OrderItemsService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<OrderItems> getAll(){
		List<OrderItems> OrderItemsList = new ArrayList<>();
		if(con!=null) {
			OrderItemsList = OrderItemsRepository.getAll(con);
		}
		return OrderItemsList;
	}
	
	public OrderItems findById(int id){
		
		OrderItems sal_emp = null;
		
		if(con!=null) {
			sal_emp = OrderItemsRepository.findById(con, id);
		}
		
		return sal_emp;
	}
	
	public int deleteById(int employee_id ) {
		return OrderItemsRepository.deleteById(con, employee_id );
	}
	
	public void create(OrderItems sal_emp) {
		OrderItemsRepository.create(con, sal_emp);
	}
	
	public void update(OrderItems sal_emp) {
		OrderItemsRepository.update(con, sal_emp);
	}

//	public List<OrderItems> getByName(String firstName) {
//		return OrderItemsRepository.getByFirstName(con, firstName);
//	}
//	public List<OrderItems> getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return OrderItemsRepository.getByDobRange(con, startDate, endDate);
//	}
	
}