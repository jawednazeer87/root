package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.EmployeeHire;
import org.jn.adv.arfaz.jdbc.repository.EmployeeHireRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class EmployeeHireService {
private Connection con = null;
	
	public EmployeeHireService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<EmployeeHire> getAll(){
		List<EmployeeHire> employeeList = new ArrayList<>();
		if(con!=null) {
			employeeList = EmployeeHireRepository.getAll(con);
		}
		return employeeList;
	}
	
	public EmployeeHire findById(int id){
		
		EmployeeHire employee = null;
		
		if(con!=null) {
			employee = EmployeeHireRepository.findById(con, id);
		}
		
		return employee;
	}
	
	public int deleteById(int employeeId) {
		return EmployeeHireRepository.deleteById(con, employeeId);
	}
	
	public void create(EmployeeHire employee) {
		EmployeeHireRepository.create(con, employee);
	}
	
	public void update(EmployeeHire employee) {
		EmployeeHireRepository.update(con, employee);
	}

	public List<EmployeeHire> getByName(String firstName) {
		return EmployeeHireRepository.getByFirstName(con, firstName);
	}
	public List<EmployeeHire> getByDobRange(LocalDate startDate, LocalDate endDate) {
		return EmployeeHireRepository.getByDobRange(con, startDate, endDate);
	}
	
}