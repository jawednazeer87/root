	package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.util.GSONGenericUtil;
import org.jn.adv.arfaz.jdbc.model.Orders;
import org.jn.adv.arfaz.jdbc.model.Orders;
import org.jn.adv.arfaz.jdbc.service.OrdersService;
import org.jn.adv.arfaz.jdbc.service.OrdersService;

public class OrdersController {
//	order_items ( order_id, product_id, quantity )
	// after invoking constructor. It will connect with database and show msg connected
	static OrdersService oIs = new OrdersService();
		public static void main(String[] args) {
//			create();
//			updateOpera();
			getById(1);
//			findAll();
//			deleteOpera();
			
			
		}
		
//		create database and insert into table create operation
//		orders ( id, user_id, status, created_at )
		static void create() {
			Orders remp = new Orders();
			remp.setId(1);
			remp.setUser_id(21280);
			remp.setStatus(true);
			LocalDate localDate = LocalDate.of(1985, 07, 21);

			remp.setCreated_at(localDate);

			
			oIs.create(remp);
			oIs.connectionClose();
		}

		// read operation		
		static void getById(int i)  {
			System.out.println(oIs.findById(i));	
		}
//		read operation
		static void findAll(){
			System.out.println(oIs.getAll());
		}
		
//		delete operation
		static void deleteOpera() {
			oIs.deleteById(1);
		}
//		update the row or column
		
//		orders ( id, user_id, status, created_at )

		static void updateOpera() {
			Orders remp = new Orders();
			LocalDate localDate = LocalDate.of(1985, 10, 31);

			remp.setId(1);
			remp.setUser_id(300);
			remp.setStatus(false);
			remp.setCreated_at(localDate);

//			name, description, primary_contact_attendee_id
			
			oIs.update(remp);
			oIs.connectionClose();

			
		}
//		static List<OrdersDTO> getAll() {
//			List<Orders> OrdersList = OrdersService.getAll();
//			OrdersService.connectionClose();
//			final List<OrdersDTO> dtoList = new ArrayList<>();
//			OrdersList.stream().forEach(Orders-> {
//				OrdersDTO dto = GSONGenericUtil.map(Orders, OrdersDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<OrdersDTO> getByDobRange() {
//			List<Orders> OrdersList = OrdersService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			OrdersService.connectionClose();
//			List<OrdersDTO> dtoList = GSONGenericUtil.mapList(OrdersList, OrdersDTO.class);
//			return dtoList;
//		}
		
		
	}
