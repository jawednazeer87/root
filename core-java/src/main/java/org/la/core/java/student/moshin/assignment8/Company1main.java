package org.la.core.java.student.moshin.assignment8;

import org.la.core.java.student.majeed.assignment8.Company;

public class Company1main {

	public static void main(String[] args) {
		Company company = new Company();
		company.setCompanyId(1587);
		company.setName("Ansari Dept");
		company.setDescription("Development Company");
		
		System.out.println("Company ID: "+company.getCompanyId());
		System.out.println("Name: "+company.getName());
		System.out.println("Description: "+company.getDescription());		
	}
	
	
	
}
