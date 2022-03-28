package org.jn.adv.arfaz.jdbc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.jdbc.dto.CompanyDTO;
import org.jn.adv.jawed.util.GSONGenericUtil;
import org.jn.adv.arfaz.jdbc.model.Company;
import org.jn.adv.arfaz.jdbc.service.CompanyService;

public class CompanyController {

	//  It will connect with database and show msg connected
	static CompanyService companyService = new CompanyService();
		public static void main(String[] args) {
//						create();
//			updateOpera();
//			getById(3);
			findAll();
//			deleteOpera();
			
			//CompanyDTO dto = GSONGenericUtil.map(getAll().get(5), CompanyDTO.class);
			//System.out.println(dto);
			//getAll().stream().forEach(System.out::println);
			
//			getByDobRange().stream().forEach(System.out::println);
		}
		
//		create database and insert into table create operation
		static void create() {
			Company company = new Company();
			company.setCompanyId(3);
			company.setName("anita");
//			name, description, primary_contact_attendee_id
			company.setDescription("I am anita");
			company.setPrimary_contact_attendee_id(12345679);
			companyService.create(company);
			companyService.connectionClose();
		}

		// read operation		
		static void getById(int i)  {
			System.out.println(companyService.findById(i));	
		}
//		read operation
		static void findAll(){
			System.out.println(companyService.getAll());
		}
		
//		delete operation
		static void deleteOpera() {
			companyService.deleteById(1);
		}
//		update the row or column
		static void updateOpera() {
			Company company = new Company();
			company.setCompanyId(3);
			company.setName("arfaz");
//			name, description, primary_contact_attendee_id
			company.setDescription("I am arfaz");
			company.setPrimary_contact_attendee_id(76809101);
			companyService.update(company);
			companyService.connectionClose();

			
		}
//		static List<CompanyDTO> getAll() {
//			List<Company> CompanyList = companyService.getAll();
//			companyService.connectionClose();
//			final List<CompanyDTO> dtoList = new ArrayList<>();
//			CompanyList.stream().forEach(Company-> {
//				CompanyDTO dto = GSONGenericUtil.map(Company, CompanyDTO.class);
//				dtoList.add(dto);
//			});
//			return dtoList;
//		}
//		
//		static List<CompanyDTO> getByDobRange() {
//			List<Company> CompanyList = companyService.getByDobRange(LocalDate.of(1979, 01, 10), 
//																		LocalDate.of(2021, 01, 10));
//			companyService.connectionClose();
//			List<CompanyDTO> dtoList = GSONGenericUtil.mapList(CompanyList, CompanyDTO.class);
//			return dtoList;
//		}
		
		
	}
