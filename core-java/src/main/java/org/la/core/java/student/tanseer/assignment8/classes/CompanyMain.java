package org.la.core.java.student.tanseer.assignment8.classes;

public class CompanyMain 
{
	public static void main(String[] args) 
	{
		Company company = new Company();
		company.setId(7001);
		company.setName("Joseph");
		company.setDescription("New Employee");
		company.display();
		
		Company company1 = new Company();
		company1.setId(7002);
		company1.setName("Razi");
		company1.setDescription("Experienced Employee");
		company1.display();
		
		Company company2 = new Company();
		company2.setId(1122);
		company2.setName("Ahmed");
		company2.setDescription("Experienced Employee");
		company2.display();
	
		// using getters
		System.out.println(company2.getId());
		System.out.println(company2.getName());
		System.out.println(company2.getDescription());
	}
}
