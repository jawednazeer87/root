package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.HourlyEmployee ;
import org.jn.adv.arfaz.jdbc.repository.HourlyEmployeeRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class HourlyEmployeeService {
private Connection con = null;
	
	public HourlyEmployeeService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<HourlyEmployee > getAll(){
		List<HourlyEmployee > HourlyEmployeeList = new ArrayList<>();
		if(con!=null) {
			HourlyEmployeeList = HourlyEmployeeRepository.getAll(con);
		}
		return HourlyEmployeeList;
	}
	
	public HourlyEmployee  findById(int id){
		
		HourlyEmployee  sal_emp = null;
		
		if(con!=null) {
			sal_emp = HourlyEmployeeRepository.findById(con, id);
		}
		
		return sal_emp;
	}
	
	public int deleteById(int employee_id ) {
		return HourlyEmployeeRepository.deleteById(con, employee_id );
	}
	
	public void create(HourlyEmployee  sal_emp) {
		HourlyEmployeeRepository.create(con, sal_emp);
	}
	
	public void update(HourlyEmployee  sal_emp) {
		HourlyEmployeeRepository.update(con, sal_emp);
	}

//	public List<HourlyEmployee > getByName(String firstName) {
//		return HourlyEmployee Repository.getByFirstName(con, firstName);
//	}
//	public List<HourlyEmployee > getByDobRange(LocalDate startDate, LocalDate endDate) {
//		return HourlyEmployee Repository.getByDobRange(con, startDate, endDate);
//	}
	
}