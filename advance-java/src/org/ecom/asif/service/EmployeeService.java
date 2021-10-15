 package org.ecom.asif.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.ecom.asif.model.Employee;
import org.ecom.asif.repository.EmployeeRepository;
import org.ecom.util.GetSqlConnection;

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
			employeeList = EmployeeRepository.getAllEmployee(con);
		}
		
		return employeeList;
	}
	
	public Employee findEmployeeById(long id){
		
		Employee employee = null;
		
		if(con!=null) {
			employee = EmployeeRepository.findEmployeeById(con, id);
		}
		
		return employee;
	}
	
	public int deleteEmployeeById(long employeeId) {
		return EmployeeRepository.deleteEmployeeById(con, employeeId);
	}
	
	public void createEmployee(Employee employee) {
		EmployeeRepository.createEmployee(con, employee);
	}
	
	public void updateEmployee(Employee employee) {
		EmployeeRepository.updateEmployee(con, employee);
	}

	public List<Employee> getEmployeeByName(String name) {
		return EmployeeRepository.getEmployeeByName(con, name);
	}

}
