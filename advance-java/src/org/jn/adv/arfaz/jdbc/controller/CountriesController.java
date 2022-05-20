	package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.util.GSONGenericUtil;
import org.jn.adv.arfaz.jdbc.model.Countries;
import org.jn.adv.arfaz.jdbc.model.Countries;
import org.jn.adv.arfaz.jdbc.service.CountriesService;
import org.jn.adv.arfaz.jdbc.service.CountriesService;

public class CountriesController {
//	countries ( code, name, continent_name )
// after invoking constructor. It will connect with database and show msg connected
	static CountriesService oIs = new CountriesService();
		public static void main(String[] args) {
			create();
//			updateOpera();
//			getById(1);
//			findAll();
//			deleteOpera();
			
			
		}
		
//		create database and insert into table create operation
//		countries ( code, name, continent_name )
		static void create() {
			Countries remp = new Countries();
			remp.setCode(1);
			remp.setName("Arfaz");
			remp.setContinent_name("Asia");
			

//			year/month/day
//			LocalDate localDate = LocalDate.of(1997, 07, 21);

//			remp.setDate_of_birth(localDate);

			
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
			Countries remp = new Countries();
			LocalDate localDate = LocalDate.of(1985, 10, 31);

			remp.setCode(1);
			remp.setName("Mohammad arfaz");
			remp.setContinent_name("Africa");
			

//			remp.setDate_of_birth(dob);
//			remp.setCreated_at(localDate);

//			name, description, primary_contact_attendee_id
			
			oIs.update(remp);
			oIs.connectionClose();

			
		}
//		static List<CountriesDTO> getAll() {
//			List<Countries> CountriesList = CountriesService.getAll();
//			CountriesService.connectionClose();
//			final List<CountriesDTO> dtoList = new ArrayList<>();
//			CountriesList.stream().forEach(Countries-> {
//				CountriesDTO dto = GSONGenericUtil.map(Countries, CountriesDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<CountriesDTO> getByDobRange() {
//			List<Countries> CountriesList = CountriesService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			CountriesService.connectionClose();
//			List<CountriesDTO> dtoList = GSONGenericUtil.mapList(CountriesList, CountriesDTO.class);
//			return dtoList;
//		}
		
		
	}
