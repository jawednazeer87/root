package org.jn.adv.student.majeed.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.majeed.jdbc.model.SalariedEmployee;
import org.jn.adv.student.majeed.jdbc.repository.SalariedEmployeeRepository;
import org.jn.adv.student.majeed.jdbc.util.GetSqlConnection;

public class SalariedEmployeeService 
{
	private Connection con = null;
	
	public SalariedEmployeeService()
	{
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose()
	{
		GetSqlConnection.connectionClose();
	}
	
	public List<SalariedEmployee> getAll(){
		List<SalariedEmployee> salariedEmployeeList = new ArrayList<>();
		if(con!=null) {
			salariedEmployeeList = SalariedEmployeeRepository.getAll(con);
		}
		return salariedEmployeeList;
	}
	
	public SalariedEmployee findById(int id){
		
		SalariedEmployee salariedEmployee = null;
		
		if(con!=null) {
			salariedEmployee = SalariedEmployeeRepository.findById(con, id);
		}
		
		return salariedEmployee;
	}
	
	public SalariedEmployee deleteById(int salariedEmployeeId) {
		SalariedEmployee salariedEmployee = null;
		
		if(con!=null) {
		 salariedEmployee = SalariedEmployeeRepository.deleteById(con, salariedEmployeeId);
		}
		return salariedEmployee;
	}
	
	public void create(SalariedEmployee salariedEmployee) {
		SalariedEmployeeRepository.create(con, salariedEmployee);
	}
	
	public void update(SalariedEmployee salariedEmployee) {
		SalariedEmployeeRepository.update(con, salariedEmployee);
	}
}
