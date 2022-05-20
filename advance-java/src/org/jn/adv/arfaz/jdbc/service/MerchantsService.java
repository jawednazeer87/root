package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Merchants ;
import org.jn.adv.arfaz.jdbc.repository.MerchantsRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class MerchantsService {
private Connection con = null;
	
	public MerchantsService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Merchants > getAll(){
		List<Merchants > MerchantsList = new ArrayList<>();
		if(con!=null) {
			MerchantsList = MerchantsRepository.getAll(con);
		}
		return MerchantsList;
	}
	
	public Merchants  findById(int id){
		
		Merchants  sal_emp = null;
		
		if(con!=null) {
			sal_emp = MerchantsRepository.findById(con, id);
		}
		
		return sal_emp;
	}
	
	public int deleteById(int employee_id ) {
		return MerchantsRepository.deleteById(con, employee_id );
	}
	
	public void create(Merchants  sal_emp) {
		MerchantsRepository.create(con, sal_emp);
	}
	
	public void update(Merchants  sal_emp) {
		MerchantsRepository.update(con, sal_emp);
	}

//	public List<Merchants > getByName(String firstName) {
//		return Merchants Repository.getByFirstName(con, firstName);
//	}
//	public List<Merchants > getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return Merchants Repository.getByDobRange(con, startDate, endDate);
//	}
	
}