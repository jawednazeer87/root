package org.la.core.java.student.nizaam.jdbc.controller;

import org.la.core.java.student.nizaam.jdbc.service.CompanyService;

public class CompanyController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompanyService cs = new CompanyService();
		
		try {
			//cs.createCompany("Oracle", "JavaJdbc Training", 2);
			System.out.println(cs.findById(3).toString());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
