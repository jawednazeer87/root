package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Brands;
import org.jn.adv.arfaz.jdbc.service.BrandsService;

public class BrandsController {

	// after invoking constructor. It will connect with database and show msg connected
	static BrandsService attendeeService = new BrandsService();
		public static void main(String[] args) {
//			create();
			updateOpera();
//			getById(1);
//			findAll();
//			deleteOpera();
			
			//BrandsServiceDTO dto = GSONGenericUtil.map(getAll().get(5), BrandsServiceDTO.class);
			//System.out.println(dto);
			//getAll().stream().forEach(System.out::println);
			
//			getByDobRange().stream().forEach(System.out::println);
		}
		
//		create database and insert into table create operation
		
//		16. brands ( id, brand_name, thumbnails )
		static void create() {
			Brands attendee = new Brands();
			attendee.setId(1);
			attendee.setBrand_name("arfaz");
//			name, description, primary_contact_attendee_id
			attendee.setThumbnails("image.jpg");
			
			attendeeService.create(attendee);
			attendeeService.connectionClose();
		}

		// read operation		
		static void getById(int i)  {
			System.out.println(attendeeService.findById(i));	
		}
//		read operation
		static void findAll(){
			System.out.println(attendeeService.getAll());
		}
		
//		delete operation
		static void deleteOpera() {
			attendeeService.deleteById(1);
		}
//		update the row or column
//		16. brands ( id, brand_name, thumbnails )
		static void updateOpera() {
			Brands attendee = new Brands();
			attendee.setId(1);
			attendee.setBrand_name("mohammad");
//			name, description, primary_contact_attendee_id
			attendee.setThumbnails("im.jpg");
			
			attendeeService.update(attendee);
			attendeeService.connectionClose();

			
		}
//		static List<BrandsServiceDTO> getAll() {
//			List<BrandsService> BrandsServiceList = attendeeService.getAll();
//			attendeeService.connectionClose();
//			final List<BrandsServiceDTO> dtoList = new ArrayList<>();
//			BrandsServiceList.stream().forEach(BrandsService-> {
//				BrandsServiceDTO dto = GSONGenericUtil.map(BrandsService, BrandsServiceDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<BrandsServiceDTO> getByDobRange() {
//			List<BrandsService> BrandsServiceList = attendeeService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			attendeeService.connectionClose();
//			List<BrandsServiceDTO> dtoList = GSONGenericUtil.mapList(BrandsServiceList, BrandsServiceDTO.class);
//			return dtoList;
//		}
		
		
	}
