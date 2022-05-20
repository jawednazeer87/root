	package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.util.GSONGenericUtil;
import org.jn.adv.arfaz.jdbc.model.Merchants;
import org.jn.adv.arfaz.jdbc.model.Merchants;
import org.jn.adv.arfaz.jdbc.service.MerchantsService;
import org.jn.adv.arfaz.jdbc.service.MerchantsService;

public class MerchantsController {
//	12. users ( id, full_name, email, gender, date_of_birth, country_code, created_at )
	// after invoking constructor. It will connect with database and show msg connected
	static MerchantsService oIs = new MerchantsService();
		public static void main(String[] args) {
			create();
//			updateOpera();
//			getById(1);
//			findAll();
//			deleteOpera();
			
			
		}
		
//		create database and insert into table create operation
//		( id, merchant_name, admin_id, country_code, created_at )
		static void create() {
			Merchants remp = new Merchants();
			remp.setId(1);
			remp.setMerchant_name("S.Arfaz");
			remp.setAdmin_id(23456);
//			year/month/day
//			LocalDate localDate = LocalDate.of(1997, 07, 21);

//			remp.setDate_of_birth(localDate);

			remp.setCountry_code("+91");
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
		
//		merchants ( id, merchant_name, admin_id, country_code, created_at )
	
		static void updateOpera() {
			Merchants remp = new Merchants();
			LocalDate localDate = LocalDate.of(1985, 10, 31);

			remp.setId(1);
			remp.setMerchant_name("Moahmmad arfaz");
			remp.setAdmin_id(23456);
			remp.setCountry_code("+21");
			LocalDate dob = LocalDate.of(1997,04,13);

//			remp.setDate_of_birth(dob);
			remp.setCreated_at(localDate);

//			name, description, primary_contact_attendee_id
			
			oIs.update(remp);
			oIs.connectionClose();

			
		}
//		static List<MerchantsDTO> getAll() {
//			List<Merchants> MerchantsList = MerchantsService.getAll();
//			MerchantsService.connectionClose();
//			final List<MerchantsDTO> dtoList = new ArrayList<>();
//			MerchantsList.stream().forEach(Merchants-> {
//				MerchantsDTO dto = GSONGenericUtil.map(Merchants, MerchantsDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<MerchantsDTO> getByDobRange() {
//			List<Merchants> MerchantsList = MerchantsService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			MerchantsService.connectionClose();
//			List<MerchantsDTO> dtoList = GSONGenericUtil.mapList(MerchantsList, MerchantsDTO.class);
//			return dtoList;
//		}
		
		
	}
