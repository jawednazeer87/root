package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Orders;
import org.jn.adv.arfaz.jdbc.repository.OrdersRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class OrdersService {
private Connection con = null;
	
	public OrdersService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Orders> getAll(){
		List<Orders> OrdersList = new ArrayList<>();
		if(con!=null) {
			OrdersList = OrdersRepository.getAll(con);
		}
		return OrdersList;
	}
	
	public Orders findById(int id){
		
		Orders sal_emp = null;
		
		if(con!=null) {
			sal_emp = OrdersRepository.findById(con, id);
		}
		
		return sal_emp;
	}
	
	public int deleteById(int employee_id ) {
		return OrdersRepository.deleteById(con, employee_id );
	}
	
	public void create(Orders sal_emp) {
		OrdersRepository.create(con, sal_emp);
	}
	
	public void update(Orders sal_emp) {
		OrdersRepository.update(con, sal_emp);
	}

//	public List<Orders> getByName(String firstName) {
//		return OrdersRepository.getByFirstName(con, firstName);
//	}
//	public List<Orders> getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return OrdersRepository.getByDobRange(con, startDate, endDate);
//	}
	
}