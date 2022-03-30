package org.jn.adv.student.moshin.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.moshin.jdbc.model.Company;
import org.jn.adv.student.moshin.jdbc.repository.CompanyRepository;
import org.jn.adv.student.moshin.jdbc.util.GetSqlConnection;

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
	
	public void create(Company company) {
		CompanyRepository.create(con, company);
	
}
	 public Company findById(int id){
			
			Company company = null;
			
			if(con!=null) {
				company = CompanyRepository.findById(con, id);
			}
			
			return company;
		}
	 public void update(Company company) {
			CompanyRepository.update(con, company);
		}
	 public int deleteById(int id) {
			return CompanyRepository.deleteById(con, id);
		}
}
