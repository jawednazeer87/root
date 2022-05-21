package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Categories;
import org.jn.adv.arfaz.jdbc.service.CategoriesService;

public class CategoriesController {

	// after invoking constructor. It will connect with database and show msg connected
	static CategoriesService attendeeService = new CategoriesService();
		public static void main(String[] args) {
//			create();
//			updateOpera();
//			getById(1);
//			findAll();
//			deleteOpera();
			
			//CategoriesServiceDTO dto = GSONGenericUtil.map(getAll().get(5), CategoriesServiceDTO.class);
			//System.out.println(dto);
			//getAll().stream().forEach(System.out::println);
			
//			getByDobRange().stream().forEach(System.out::println);
		}
		
//		create database and insert into table create operation
		
//		17. categorys ( id, category_name, thumbnails )
		static void create() {
			Categories attendee = new Categories();
			attendee.setId(1);
			attendee.setCategory_name("arfaz");
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
			Categories attendee = new Categories();
			attendee.setId(1);
			attendee.setCategory_name("mohammad");
//			name, description, primary_contact_attendee_id
			attendee.setThumbnails("im.jpg");
			
			attendeeService.update(attendee);
			attendeeService.connectionClose();

			
		}
//		static List<CategoriesServiceDTO> getAll() {
//			List<CategoriesService> CategoriesServiceList = attendeeService.getAll();
//			attendeeService.connectionClose();
//			final List<CategoriesServiceDTO> dtoList = new ArrayList<>();
//			CategoriesServiceList.stream().forEach(CategoriesService-> {
//				CategoriesServiceDTO dto = GSONGenericUtil.map(CategoriesService, CategoriesServiceDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<CategoriesServiceDTO> getByDobRange() {
//			List<CategoriesService> CategoriesServiceList = attendeeService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			attendeeService.connectionClose();
//			List<CategoriesServiceDTO> dtoList = GSONGenericUtil.mapList(CategoriesServiceList, CategoriesServiceDTO.class);
//			return dtoList;
//		}
		
		
	}
