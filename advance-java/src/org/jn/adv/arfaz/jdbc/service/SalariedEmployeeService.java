package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.SalariedEmployee;
import org.jn.adv.arfaz.jdbc.repository.SalariedEmployeeRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class SalariedEmployeeService {
private Connection con = null;
	
	public SalariedEmployeeService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<SalariedEmployee> getAll(){
		List<SalariedEmployee> SalariedEmployeeList = new ArrayList<>();
		if(con!=null) {
			SalariedEmployeeList = SalariedEmployeeRepository.getAll(con);
		}
		return SalariedEmployeeList;
	}
	
	public SalariedEmployee findById(int id){
		
		SalariedEmployee sal_emp = null;
		
		if(con!=null) {
			sal_emp = SalariedEmployeeRepository.findById(con, id);
		}
		
		return sal_emp;
	}
	
	public int deleteById(int employee_id ) {
		return SalariedEmployeeRepository.deleteById(con, employee_id );
	}
	
	public void create(SalariedEmployee sal_emp) {
		SalariedEmployeeRepository.create(con, sal_emp);
	}
	
	public void update(SalariedEmployee sal_emp) {
		SalariedEmployeeRepository.update(con, sal_emp);
	}

//	public List<SalariedEmployee> getByName(String firstName) {
//		return SalariedEmployeeRepository.getByFirstName(con, firstName);
//	}
//	public List<SalariedEmployee> getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return SalariedEmployeeRepository.getByDobRange(con, startDate, endDate);
//	}
	
}