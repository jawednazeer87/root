package org.jn.adv.student.tanseer.jdbc.controller;

import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.Company;
import org.jn.adv.student.tanseer.jdbc.service.CompanyService;


public class CompanyController 
{
	static CompanyService companyservice = new CompanyService();
	
	public static void main(String[] args) 
	{
//		create();
		getAll();
//		deleteByName();
//		update();
	}
	
	static void create()
	{
		Company company = new Company();
		company.setCompanyId(12007);
		company.setName("Meta");
		company.setDescription("Multinational Company");
		company.setPrimaryContact(12345);
		company.setAttendeeId(1226);
		companyservice.create(company);
//		companyservice.connectionClose();
		
		company = new Company();
		company.setCompanyId(12009);
		company.setName("Facebook");
		company.setDescription("Multinational Company");
		company.setPrimaryContact(12345667);
		company.setAttendeeId(1223);
		companyservice.create(company);
		companyservice.connectionClose();
	}
	
	static List<Company> getAll()
	{
		List<Company> companyList = companyservice.getAll();
		System.out.println(companyList);
		companyservice.connectionClose();
		return companyList;
	}
	
	static void deleteByName()
	{
		Company company = new Company();
		company = companyservice.deleteByName("Facebook");
		System.out.println(company);
		companyservice.connectionClose();
	}
	
	// This update method is not accurately functional
	static Company update()
	{
		Company company = new Company();
		company = companyservice.update(company);
		System.out.println(company);
		companyservice.connectionClose();
		return company;
	}
}
