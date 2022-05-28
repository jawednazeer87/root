package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.RelationTable;
import org.jn.adv.arfaz.jdbc.service.RelationTableService;

public class RelationTableController {

	// after invoking constructor. It will connect with database and show msg connected
	static RelationTableService attendeeService = new RelationTableService();
		public static void main(String[] args) {
//			create();
//			updateOpera();
//			getById(1);
//			findAll();
			deleteOpera();
			
			//RelationTableServiceDTO dto = GSONGenericUtil.map(getAll().get(5), RelationTableServiceDTO.class);
			//System.out.println(dto);
			//getAll().stream().forEach(System.out::println);
			
//			getByDobRange().stream().forEach(System.out::println);
		}
		
//		create database and insert into table create operation
		
//		
//		( id, brands_id, category_id, collection_id)
		static void create() {
			RelationTable attendee = new RelationTable();
			attendee.setId(1);
			attendee.setCategory_id(12);
			attendee.setBrands_id(1234);
//			name, description, primary_contact_attendee_id
			attendee.setCollection_id(345);
			
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
//		( id, brands_id, category_id, collection_id)
		static void updateOpera() {
			RelationTable attendee = new RelationTable();
			attendee.setId(1);
			attendee.setBrands_id(2354);
			attendee.setCategory_id(15354);

			attendee.setCollection_id(2354634);
//			name, description, primary_contact_attendee_id
			
			attendeeService.update(attendee);
			attendeeService.connectionClose();

			
		}
//		static List<RelationTableServiceDTO> getAll() {
//			List<RelationTableService> RelationTableServiceList = attendeeService.getAll();
//			attendeeService.connectionClose();
//			final List<RelationTableServiceDTO> dtoList = new ArrayList<>();
//			RelationTableServiceList.stream().forEach(RelationTableService-> {
//				RelationTableServiceDTO dto = GSONGenericUtil.map(RelationTableService, RelationTableServiceDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<RelationTableServiceDTO> getByDobRange() {
//			List<RelationTableService> RelationTableServiceList = attendeeService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			attendeeService.connectionClose();
//			List<RelationTableServiceDTO> dtoList = GSONGenericUtil.mapList(RelationTableServiceList, RelationTableServiceDTO.class);
//			return dtoList;
//		}
		
		
	}
