package org.jn.adv.student.tanseer.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.student.tanseer.jdbc.model.Employee;
import org.jn.adv.student.tanseer.jdbc.repository.EmployeeRepository;
import org.jn.adv.student.tanseer.jdbc.util.GetSqlConnection;

public class EmployeeService 
{
	private Connection con = null;
	
	public EmployeeService()
	{
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose()
	{
		GetSqlConnection.connectionClose();
	}
	
	public List<Employee> getAll(){
		List<Employee> employeeList = new ArrayList<>();
		if(con!=null) {
			employeeList = EmployeeRepository.getAll(con);
		}
		return employeeList;
	}
	
	public void create(Employee employee) {
		EmployeeRepository.create(con, employee);
	}
}
