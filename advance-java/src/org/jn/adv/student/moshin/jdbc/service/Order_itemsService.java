package org.jn.adv.student.moshin.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.model.Order_items;
import org.jn.adv.student.moshin.jdbc.repository.EmployeeRepository;
import org.jn.adv.student.moshin.jdbc.repository.Order_itemsRepository;
import org.jn.adv.student.moshin.jdbc.util.GetSqlConnectionStudentDB;

public class Order_itemsService {

private Connection con = null;
	
	public Order_itemsService() {
		con = GetSqlConnectionStudentDB.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnectionStudentDB.connectionClose();
	}
	
	public List<Order_items> getAll(){
		List<Order_items> order_itemsList = new ArrayList<>();
		if(con!=null) {
			order_itemsList = Order_itemsRepository.getAll(con);
		}
		return order_itemsList;
	}
	
	public Order_items findById(int id){
		
		Order_items order_items = null;
		
		if(con!=null) {
			order_items = Order_itemsRepository.findById(con, id);
		}
		
		return order_items;
	}
	
	public int deleteById(int employeeId) {
		return Order_itemsRepository.deleteById(con, employeeId);
	}
	
	public void create(Order_items order_items) {
		Order_itemsRepository.create(con, order_items);
	}
	
	public void update(Order_items order_items) {
		Order_itemsRepository.update(con, order_items);
	}

	public List<Order_items> getByorder_id(Integer order_id) {
		return Order_itemsRepository.getByOrder_id(con, order_id);
	}
	
}
