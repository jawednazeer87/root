package org.jn.adv.student.majeed.jdbc.controller;

import org.jn.adv.student.majeed.jdbc.model.Company;
import org.jn.adv.student.majeed.jdbc.service.CompanyService;

import java.util.List;

/**
* @author AbdulMajeed
*
*/

public class CompanyController {
	
	static CompanyService companyService = new CompanyService();
	
	public static void main(String[] args) {
		//create();
		//getAll();
		//findById();
		//deleteById();
		update();
	}
	
	static void create() {
		
		Company company = new Company();
		company.setId(2);
		company.setName("Smart Company");
		company.setDescription("Smart Company for IT Solutions");
		company.setPrimaryContactAttendeeId(102);		
		
		companyService.create(company);
		companyService.connectionClose();
	}
	
	static List<Company> getAll()
	{
		List<Company> companyList = companyService.getAll();
		System.out.println(companyList);
		companyService.connectionClose();
		return companyList;
	}	
	
	static void findById() {
		Company company = new Company();
	company= companyService.findById(1);
		System.out.println(company);
		companyService.connectionClose();
	}	
	
	static void deleteById() {
		
		System.out.println(companyService.deleteById(2));
		companyService.connectionClose();
	}
	
	static void update() {
		Company company = new Company();
		company.setId(2);
		company.setName("Perfect Company");
		company.setDescription("Perfect Company for IT Solutions");
		company.setPrimaryContactAttendeeId(2111);
		
		companyService.update(company);
		companyService.connectionClose();
	}	
}
