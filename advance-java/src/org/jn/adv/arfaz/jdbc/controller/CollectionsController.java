package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Collections;
import org.jn.adv.arfaz.jdbc.service.CollectionsService;

public class CollectionsController {

	// after invoking constructor. It will connect with database and show msg connected
	static CollectionsService attendeeService = new CollectionsService();
		public static void main(String[] args) {
//			create();
//			updateOpera();
//			getById(1);
			findAll();
//			deleteOpera();
			
			//CollectionsServiceDTO dto = GSONGenericUtil.map(getAll().get(5), CollectionsServiceDTO.class);
			//System.out.println(dto);
			//getAll().stream().forEach(System.out::println);
			
//			getByDobRange().stream().forEach(System.out::println);
		}
		
//		create database and insert into table create operation
		
//		 collections ( id, collection_name, thumbnails )
		static void create() {
			Collections attendee = new Collections();
			attendee.setId(1);
			attendee.setCollection_name("arfaz");
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
			Collections attendee = new Collections();
			attendee.setId(1);
			attendee.setCollection_name("mohammad");
//			name, description, primary_contact_attendee_id
			attendee.setThumbnails("im.jpg");
			
			attendeeService.update(attendee);
			attendeeService.connectionClose();

			
		}
//		static List<CollectionsServiceDTO> getAll() {
//			List<CollectionsService> CollectionsServiceList = attendeeService.getAll();
//			attendeeService.connectionClose();
//			final List<CollectionsServiceDTO> dtoList = new ArrayList<>();
//			CollectionsServiceList.stream().forEach(CollectionsService-> {
//				CollectionsServiceDTO dto = GSONGenericUtil.map(CollectionsService, CollectionsServiceDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<CollectionsServiceDTO> getByDobRange() {
//			List<CollectionsService> CollectionsServiceList = attendeeService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			attendeeService.connectionClose();
//			List<CollectionsServiceDTO> dtoList = GSONGenericUtil.mapList(CollectionsServiceList, CollectionsServiceDTO.class);
//			return dtoList;
//		}
		
		
	}
