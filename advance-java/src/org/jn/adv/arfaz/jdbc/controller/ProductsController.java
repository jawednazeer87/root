	package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.util.GSONGenericUtil;
import org.jn.adv.arfaz.jdbc.model.Products;
import org.jn.adv.arfaz.jdbc.model.Products;
import org.jn.adv.arfaz.jdbc.service.ProductsService;
import org.jn.adv.arfaz.jdbc.service.ProductsService;

public class ProductsController {
//	products ( id, merchant_id, name, price, status, created_at )	// after invoking constructor. It will connect with database and show msg connected
	static ProductsService oIs = new ProductsService();
		public static void main(String[] args) {
//			create();
//			updateOpera();
//			getById(1);
			findAll();
//			deleteOpera();
			
			
		}
		
//		create database and insert into table create operation
//		products ( id, merchant_id, name, price, status, created_at )	
		static void create() {
			Products remp = new Products();
			remp.setId(1);
			remp.setMerchant_id(23456);
			remp.setName("Arfaz");
			remp.setPrice(10);
			

//			year/month/day
//			LocalDate localDate = LocalDate.of(1997, 07, 21);

//			remp.setDate_of_birth(localDate);

			remp.setStatus(true);
			LocalDate created = LocalDate.of(2022, 07, 21);
			remp.setCreated_at(created);
			
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
		
//		products ( id, merchant_id, name, price, status, created_at )
	
		static void updateOpera() {
			Products remp = new Products();
			LocalDate localDate = LocalDate.of(1985, 10, 31);

			remp.setId(1);
			remp.setMerchant_id(23456);
			remp.setName("Mohammad arfaz");
			remp.setPrice(250);
			remp.setStatus(false);

//			remp.setDate_of_birth(dob);
			remp.setCreated_at(localDate);

//			name, description, primary_contact_attendee_id
			
			oIs.update(remp);
			oIs.connectionClose();

			
		}
//		static List<ProductsDTO> getAll() {
//			List<Products> ProductsList = ProductsService.getAll();
//			ProductsService.connectionClose();
//			final List<ProductsDTO> dtoList = new ArrayList<>();
//			ProductsList.stream().forEach(Products-> {
//				ProductsDTO dto = GSONGenericUtil.map(Products, ProductsDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<ProductsDTO> getByDobRange() {
//			List<Products> ProductsList = ProductsService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			ProductsService.connectionClose();
//			List<ProductsDTO> dtoList = GSONGenericUtil.mapList(ProductsList, ProductsDTO.class);
//			return dtoList;
//		}
		
		
	}
