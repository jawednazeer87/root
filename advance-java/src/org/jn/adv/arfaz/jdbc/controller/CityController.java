package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.util.GSONGenericUtil;
import org.jn.adv.arfaz.jdbc.model.City;
import org.jn.adv.arfaz.jdbc.model.City;
import org.jn.adv.arfaz.jdbc.service.CityService;

public class CityController {
//	city ( id, city )
	// after invoking constructor. It will connect with database and show msg connected
	static CityService cityService = new CityService();
		public static void main(String[] args) {
//			create();
//			updateOpera();
//			getById(2);
			findAll();
//			deleteOpera();
			
			
		}
		
//		create database and insert into table create operation
//		city ( id, city )		
		static void create() {
			City city = new City();
			city.setId(1);
//			name, description, primary_contact_attendee_id
			city.setCity("Nandalur");
			cityService.create(city);
			cityService.connectionClose();
		}

		// read operation		
		static void getById(int i)  {
			System.out.println(cityService.findById(i));	
		}
//		read operation
		static void findAll(){
			System.out.println(cityService.getAll());
		}
		
//		delete operation
		static void deleteOpera() {
			cityService.deleteById(2);
		}
//		update the row or column
		static void updateOpera() {
			City city = new City();
			city.setId(1);
			city.setCity("Nandalur");
//			name, description, primary_contact_attendee_id
			
			cityService.update(city);
			cityService.connectionClose();

			
		}
//		static List<CityDTO> getAll() {
//			List<City> CityList = CityService.getAll();
//			CityService.connectionClose();
//			final List<CityDTO> dtoList = new ArrayList<>();
//			CityList.stream().forEach(City-> {
//				CityDTO dto = GSONGenericUtil.map(City, CityDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<CityDTO> getByDobRange() {
//			List<City> CityList = CityService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			CityService.connectionClose();
//			List<CityDTO> dtoList = GSONGenericUtil.mapList(CityList, CityDTO.class);
//			return dtoList;
//		}
		
		
	}
