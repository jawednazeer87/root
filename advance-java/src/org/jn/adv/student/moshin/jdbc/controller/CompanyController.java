package org.jn.adv.student.moshin.jdbc.controller;

import java.util.Date;
import java.util.List;

import org.jn.adv.waleed.jdbc.model.Company;
import org.jn.adv.waleed.jdbc.model.Employee;
import org.jn.adv.waleed.jdbc.service.CompanyService;
import org.jn.adv.waleed.jdbc.service.EmployeeService;

public class CompanyController {

	static CompanyService companyService = new CompanyService();
	public static void main(String[] args) {
		//create ();
		getAll();
		//findById();
		//update();
		//deleteById();
		//CompanyService companyService = new CompanyService();
		//List<Company> companyList= companyService.getAll();
		//System.out.println(companyList);
		//companyService.connectionClose();
		
		

	}

	
	static void create () {
		//CompanyService companyService = new CompanyService();
		
		Company company = new Company();
		//company.setId(1788);
		company.setCompanyName("Ansari");
		company.setFounderName("Ansari Moshin");
		company.setRegistrationNum("A1B20099A");
		company.setYearlyTurnover(2000000.0);;
		companyService.create(company);
		companyService.connectionClose();
	}
	
	static void getAll() {
		List<Company> companyList= companyService.getAll();
		System.out.println(companyList);
				companyService.connectionClose();
				
	}
	
	static void findById() {
		Company company = new Company();
	company= companyService.findById(123);
		System.out.println(company);
		companyService.connectionClose();
	}
	
	static void update() {
		Company company = new Company();
		company.setId(3210);
	    company.setCompanyName("Ansari");
		company.setFounderName("Ansari Moshin");
		company.setRegistrationNum("AbI3270X");
		company.setYearlyTurnover(2000000.0);
		
		companyService.update(company);
		companyService.connectionClose();
	}
	static void deleteById() {
	
		System.out.println(companyService.deleteById(3218));
		companyService.connectionClose();
	}
}
