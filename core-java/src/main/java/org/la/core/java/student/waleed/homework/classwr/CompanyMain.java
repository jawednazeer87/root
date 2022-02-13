package org.la.core.java.student.waleed.homework.classwr;

import org.la.core.java.student.waleed.homework.classwr.model.Company;

/**
 * @author Waleed Rizq
 *
 * @date Feb 2, 2022
 */
public class CompanyMain {

	
	public static void main(String[] args) {
	
	Company company = new Company();
	company.setCompanyId(11007);
	company.setName("Rahmah");
	company.setDescription("Import and Export");
	System.out.println(" companyId: "+ company.getCompanyId());
	System.out.println(" name: "+ company.getName());
	System.out.println(" description: "+ company.getDescription());
		

}
}
