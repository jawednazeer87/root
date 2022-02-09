package org.la.core.java.student.majeed.assignment8;

/*
1.	Create a class Company having member variables companyId, name, description. create getters and 
		setters for all member variables. Create object of Company class in other class inside main method
		and set all member values and print all member values using getters. 
 */

public class CompanyMain {
	public static void main(String[] args) {
		Company company = new Company();
		company.setCompanyId(1);
		company.setName("ABC GROUP");
		company.setDescription("Software Development Company");
		
		System.out.println("Company ID: "+company.getCompanyId());
		System.out.println("Name: "+company.getName());
		System.out.println("Description: "+company.getDescription());		
	}
	
	
	
}
