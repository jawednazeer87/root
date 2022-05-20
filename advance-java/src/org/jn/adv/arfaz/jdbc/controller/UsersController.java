	package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.util.GSONGenericUtil;
import org.jn.adv.arfaz.jdbc.model.Users;
import org.jn.adv.arfaz.jdbc.model.Users;
import org.jn.adv.arfaz.jdbc.service.UsersService;
import org.jn.adv.arfaz.jdbc.service.UsersService;

public class UsersController {
//	12. users ( id, full_name, email, gender, date_of_birth, country_code, created_at )
	// after invoking constructor. It will connect with database and show msg connected
	static UsersService oIs = new UsersService();
		public static void main(String[] args) {
			create();
//			updateOpera();
//			getById(1);
//			findAll();
//			deleteOpera();
			
			
		}
		
//		create database and insert into table create operation
//		12. users ( id, full_name, email, gender, date_of_birth, country_code, created_at )
		static void create() {
			Users remp = new Users();
			remp.setId(1);
			remp.setFull_name("S.Arfaz");
			remp.setEmail("arfaz@gmail.com");
			remp.setGender(true);
//			year/month/day
			LocalDate localDate = LocalDate.of(1997, 07, 21);

			remp.setDate_of_birth(localDate);

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
		
//		12. users ( id, full_name, email, gender, date_of_birth, country_code, created_at
	
		static void updateOpera() {
			Users remp = new Users();
			LocalDate localDate = LocalDate.of(1985, 10, 31);

			remp.setId(1);
			remp.setFull_name("Moahmmad arfaz");
			remp.setEmail("arfaz3838@gmail.com");
			remp.setGender(true);
			LocalDate dob = LocalDate.of(1997,04,13);

			remp.setDate_of_birth(dob);
			remp.setCountry_code("+1");
			remp.setCreated_at(localDate);

//			name, description, primary_contact_attendee_id
			
			oIs.update(remp);
			oIs.connectionClose();

			
		}
//		static List<UsersDTO> getAll() {
//			List<Users> UsersList = UsersService.getAll();
//			UsersService.connectionClose();
//			final List<UsersDTO> dtoList = new ArrayList<>();
//			UsersList.stream().forEach(Users-> {
//				UsersDTO dto = GSONGenericUtil.map(Users, UsersDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<UsersDTO> getByDobRange() {
//			List<Users> UsersList = UsersService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			UsersService.connectionClose();
//			List<UsersDTO> dtoList = GSONGenericUtil.mapList(UsersList, UsersDTO.class);
//			return dtoList;
//		}
		
		
	}
