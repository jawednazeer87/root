package org.jn.adv.student.tanseer.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.SalariedEmployee;
import org.jn.adv.student.tanseer.jdbc.repository.SalariedEmployeeRepository;
import org.jn.adv.student.tanseer.jdbc.util.GetSqlConnection;

public class SalariedEmployeeService {
	
	private Connection con = null;
	
	public SalariedEmployeeService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose()
	{
		GetSqlConnection.connectionClose();
	}
	
	public int deleteById(int id) {
		return SalariedEmployeeRepository.deleteById(con, id );
	}
	
	public void create(SalariedEmployee salariedEmployee) {
		SalariedEmployeeRepository.create(con, salariedEmployee);
	}
	
	public void update(SalariedEmployee salariedEmployee) {
		SalariedEmployeeRepository.update(con, salariedEmployee);
	}
	
	public List<SalariedEmployee> getAll(){
		List<SalariedEmployee> salariedEmployeeList = new ArrayList<>();
		if(con!=null) {
			salariedEmployeeList = SalariedEmployeeRepository.getAll(con);
		}
		return salariedEmployeeList;
	}
}
