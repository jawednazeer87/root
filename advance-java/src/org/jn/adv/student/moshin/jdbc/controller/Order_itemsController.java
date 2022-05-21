package org.jn.adv.student.moshin.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.dto.EmployeeDTO;
import org.jn.adv.student.moshin.jdbc.dto.Order_itemsDTO;
import org.jn.adv.student.moshin.jdbc.model.Employee;
import org.jn.adv.student.moshin.jdbc.model.Order_items;
import org.jn.adv.student.moshin.jdbc.service.EmployeeService;
import org.jn.adv.student.moshin.jdbc.service.Order_itemsService;
import org.jn.adv.student.moshin.jdbc.util.GSONGenericUtil;

public class Order_itemsController {
		static Order_itemsService order_itemsService = new Order_itemsService();
		public static void main(String[] args) {
			create();
//			EmployeeDTO dto = GSONGenericUtil.map(getAll().get(5), EmployeeDTO.class);
//			System.out.println(dto);
//			getAll().stream().forEach(System.out::println);
//			getByDobRange().stream().forEach(System.out::println);
		}
		
		static void create() {
			Order_items order_items = new Order_items();
			order_items.setOrder_id(1);
			order_items.setProduct_id(1547);
			order_items.setQuantity(78555);
			order_itemsService.create(order_items);
			order_itemsService.connectionClose();
		}
		
		static List<Order_itemsDTO> getAll() {
			List<Order_items> order_itemsList = order_itemsService.getAll();
			order_itemsService.connectionClose();
			final List<Order_itemsDTO> dtoList = new ArrayList<>();
			order_itemsList.stream().forEach(order_items-> {
				Order_itemsDTO dto = GSONGenericUtil.map(order_items, Order_itemsDTO.class);
				dtoList.add(dto);
			});
			return dtoList;
		}
		
		

}
