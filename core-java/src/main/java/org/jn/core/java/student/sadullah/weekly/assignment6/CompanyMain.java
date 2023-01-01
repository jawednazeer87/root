package org.jn.core.java.student.sadullah.weekly.assignment6;

public class CompanyMain {
	public static void main(String[] args) {
		Company company = new Company();
		company.setCompanyId(12039);
		company.setName("Sadullah");
		company.setDescription("Developer");
		
		int companyId = company.getCompanyId();
		String name = company.getName();
		String description = company.getDescription();
		
		System.out.println("Company Id No: " +companyId);
		System.out.println("Name: " +name);
		System.out.println("Description: " +description);
	}
}
