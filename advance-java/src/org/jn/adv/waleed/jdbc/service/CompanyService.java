package org.jn.adv.waleed.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.waleed.jdbc.model.Company;

import org.jn.adv.waleed.jdbc.myutil.GetSqlConnection1;
import org.jn.adv.waleed.jdbc.repository.CompanyRepository;



/**
 * @author Waleed Rizq
 *
 * @date Mar 16, 2022
 */
public class CompanyService {
	
private Connection con = null;
	
	public CompanyService() {
		con = GetSqlConnection1.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection1.connectionClose();
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
}
