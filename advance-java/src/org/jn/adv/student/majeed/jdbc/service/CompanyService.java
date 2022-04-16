package org.jn.adv.student.majeed.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.majeed.jdbc.model.Company;
import org.jn.adv.student.majeed.jdbc.repository.CompanyRepository;
import org.jn.adv.student.majeed.jdbc.util.GetSqlConnection;

public class CompanyService {
	
private Connection con = null;
	
	public CompanyService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Company> getAll(){
		List<Company> companyList = new ArrayList<>();
		if(con!=null) {
			companyList = CompanyRepository.getAll(con);
		}
		return companyList;
	}
	
	public Company findById(int id){
		
		Company company = null;
		
		if(con!=null) {
			company = CompanyRepository.findById(con, id);
		}
		
		return company;
	}
	
	public int deleteById(int companyId) {
		return CompanyRepository.deleteById(con, companyId);
	}
	
	public void create(Company company) {
		CompanyRepository.create(con, company);
	}
	
	public void update(Company company) {
		CompanyRepository.update(con, company);
	}
}
