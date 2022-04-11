package org.jn.adv.student.tanseer.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.Company;
import org.jn.adv.student.tanseer.jdbc.repository.CompanyRepository;
import org.jn.adv.student.tanseer.jdbc.util.GetSqlConnection;

public class CompanyService 
{
	private Connection con = null;
	
	public CompanyService()
	{
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose()
	{
		GetSqlConnection.connectionClose();
	}
	
	public void create(Company company) {
		CompanyRepository.create(con, company);
	}
	
	public List<Company> getAll(){
		List<Company> companyList = new ArrayList<>();
		if(con!=null) {
			companyList = CompanyRepository.getAll(con);
		}
		return companyList;
	}
	
	public Company deleteByName(String name)
	{
		Company company = null;
		
		if(con!=null) {
			company = CompanyRepository.deleteByName(con, name);
			}
			return company;
	}
	
	public Company update(Company company)
	{
		company = null;
		
		if(con!=null) {
		CompanyRepository.update(con, company);
		}
		return company;

	}
}
