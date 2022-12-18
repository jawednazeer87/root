package org.jn.core.java.jawed.clss;

import org.jn.core.java.jawed.model.Company;

/**
 * @author jawednazeer
 *
 */
public class CompanyMain {

	public static void main(String[] args) {
		
		Company company = new Company();
		company.display();
		Company company2 = new Company(2, "hero", "singapore");
		company2.display();
		Company company3 = new Company();
		company3.display();
	}
}
