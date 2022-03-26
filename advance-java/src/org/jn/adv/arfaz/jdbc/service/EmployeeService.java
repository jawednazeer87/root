package org.jn.adv.arfaz.jdbc.service;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.arfaz.jdbc.model.Employee;
import org.jn.adv.arfaz.jdbc.repository.EmployeeRepository;
import org.jn.adv.arfaz.jdbc.util.GetSqlConnection;

public class EmployeeService {
private Connection con = null;
	
	public EmployeeService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Employee> getAll(){
		List<Employee> employeeList = new ArrayList<>();
		if(con!=null) {
			employeeList = EmployeeRepository.getAll(con);
		}
		return employeeList;
	}
	
	public Employee findById(int id){
		
		Employee employee = null;
		
		if(con!=null) {
			employee = EmployeeRepository.findById(con, id);
		}
		
		return employee;
	}
	
	public int deleteById(int employeeId) {
		return EmployeeRepository.deleteById(con, employeeId);
	}
	
	public void create(Employee employee) {
		EmployeeRepository.create(con, employee);
	}
	
	public void update(Employee employee) {
		EmployeeRepository.update(con, employee);
	}

	public List<Employee> getByName(String firstName) {
		return EmployeeRepository.getByFirstName(con, firstName);
	}
	public List<Employee> getByDobRange(LocalDate startDate, LocalDate endDate) {
		return EmployeeRepository.getByDobRange(con, startDate, endDate);
	}
	
}