package org.jn.core.java.student.sayed.hassain.clss;

public class CompanyMain {

	public static void main(String[] args) {
		Company company=new Company();
		company.setterCompanyId(1000);
		System.out.println(company.getterCompanyId());
		
		company.setterName("Microsoft");
		System.out.println(company.getterName());
		
		company.setterDescription("It is a Software Company");
		System.out.println(company.getterDescription());
	}

}
