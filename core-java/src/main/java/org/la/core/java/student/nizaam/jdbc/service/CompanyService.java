package org.la.core.java.student.nizaam.jdbc.service;

import org.la.core.java.student.nizaam.jdbc.model.Company;
import org.la.core.java.student.nizaam.jdbc.repository.CompanyRepository;

public class CompanyService {

	private CompanyRepository cr = new CompanyRepository();
	
	public void createCompany(String name, String description, int primaryContactAttendeeId) throws Exception {
		cr.createCompany(name, description, primaryContactAttendeeId);
		
	}
	
	public Company findById(int CompanyId) throws Exception {
		return cr.findById(CompanyId);
	}
			
}
