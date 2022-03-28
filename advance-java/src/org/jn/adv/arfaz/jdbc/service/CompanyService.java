package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Company;
import org.jn.adv.arfaz.jdbc.repository.CompanyRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class CompanyService {
private Connection con = null;
	
	public CompanyService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Company> getAll(){
		List<Company> CompanyList = new ArrayList<>();
		if(con!=null) {
			CompanyList = CompanyRepository.getAll(con);
		}
		return CompanyList;
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

//	public List<Company> getByName(String firstName) {
//		return CompanyRepository.getByFirstName(con, firstName);
//	}
//	public List<Company> getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return CompanyRepository.getByDobRange(con, startDate, endDate);
//	}
	
}