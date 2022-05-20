	package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.util.GSONGenericUtil;
import org.jn.adv.arfaz.jdbc.model.OrderItems;
import org.jn.adv.arfaz.jdbc.model.OrderItems;
import org.jn.adv.arfaz.jdbc.service.OrderItemsService;

public class OrderItemsController {
//	order_items ( order_id, product_id, quantity )
	// after invoking constructor. It will connect with database and show msg connected
	static OrderItemsService oIs = new OrderItemsService();
		public static void main(String[] args) {
//			create();
//			updateOpera();
//			getById(2);
//			findAll();
			deleteOpera();
			
			
		}
		
//		create database and insert into table create operation
//		order_items ( order_id, product_id, quantity )
		static void create() {
			OrderItems remp = new OrderItems();
			remp.setOrder_id(1);
			remp.setProduct_id(21280);
			remp.setQuantity(1500);
			
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
		
//		order_items ( order_id, product_id, quantity )

		static void updateOpera() {
			OrderItems remp = new OrderItems();
			remp.setOrder_id(1);
			remp.setProduct_id(300);
			remp.setQuantity(225678);

//			name, description, primary_contact_attendee_id
			
			oIs.update(remp);
			oIs.connectionClose();

			
		}
//		static List<OrderItemsDTO> getAll() {
//			List<OrderItems> OrderItemsList = OrderItemsService.getAll();
//			OrderItemsService.connectionClose();
//			final List<OrderItemsDTO> dtoList = new ArrayList<>();
//			OrderItemsList.stream().forEach(OrderItems-> {
//				OrderItemsDTO dto = GSONGenericUtil.map(OrderItems, OrderItemsDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<OrderItemsDTO> getByDobRange() {
//			List<OrderItems> OrderItemsList = OrderItemsService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			OrderItemsService.connectionClose();
//			List<OrderItemsDTO> dtoList = GSONGenericUtil.mapList(OrderItemsList, OrderItemsDTO.class);
//			return dtoList;
//		}
		
		
	}
