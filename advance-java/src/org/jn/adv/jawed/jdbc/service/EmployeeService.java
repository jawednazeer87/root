package org.jn.adv.jawed.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.jawed.jdbc.model.Employee;
import org.jn.adv.jawed.jdbc.repository.EmployeeRepository;
import org.jn.adv.jawed.jdbc.util.GetSqlConnection;

public class EmployeeService {

private Connection con = null;
	
	public EmployeeService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Employee> getAllEmployee(){
		
		List<Employee> employeeList = new ArrayList<>();
		
		if(con!=null) {
			employeeList = EmployeeRepository.getAll(con);
		}
		
		return employeeList;
	}
	
	public Employee findEmployeeById(int id){
		
		Employee employee = null;
		
		if(con!=null) {
			employee = EmployeeRepository.findById(con, id);
		}
		
		return employee;
	}
	
	public int deleteEmployeeById(int employeeId) {
		return EmployeeRepository.deleteById(con, employeeId);
	}
	
	public void createEmployee(Employee employee) {
		EmployeeRepository.create(con, employee);
	}
	
	public void updateEmployee(Employee employee) {
		EmployeeRepository.update(con, employee);
	}

	public List<Employee> getEmployeeByName(String firstName) {
		return EmployeeRepository.getByFirstName(con, firstName);
	}

}