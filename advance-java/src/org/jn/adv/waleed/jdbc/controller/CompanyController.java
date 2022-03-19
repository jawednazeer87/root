package org.jn.adv.waleed.jdbc.controller;

import java.util.Date;
import java.util.List;

import org.jn.adv.waleed.jdbc.model.Company;
import org.jn.adv.waleed.jdbc.model.Employee;
import org.jn.adv.waleed.jdbc.service.CompanyService;
import org.jn.adv.waleed.jdbc.service.EmployeeService;

/**
 * @author Waleed Rizq
 *
 * @date Mar 16, 2022
 */
public class CompanyController {

	static CompanyService companyService = new CompanyService();
	public static void main(String[] args) {
		//create ();
		getAll();
		
		//CompanyService companyService = new CompanyService();
		//List<Company> companyList= companyService.getAll();
		//System.out.println(companyList);
		//companyService.connectionClose();
		
		

	}

	
	static void create () {
		//CompanyService companyService = new CompanyService();
		
		Company company = new Company();
		//company.setId(1788);
		company.setCompanyName("ARhamah");
		company.setFounderName("Aiman");
		company.setRegistrationNum("A1B20047");
		company.setYearlyTurnover(1100000.0);;
		companyService.create(company);
		companyService.connectionClose();
	}
	
	static void getAll() {
		List<Company> companyList= companyService.getAll();
		System.out.println(companyList);
				companyService.connectionClose();
				
	}
}
