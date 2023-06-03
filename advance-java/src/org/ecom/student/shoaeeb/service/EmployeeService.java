package org.ecom.student.shoaeeb.service;

import java.sql.Connection;
import java.util.List;

import org.ecom.student.shoaeeb.model.Employee;
import org.ecom.student.shoaeeb.repository.EmployeeRepository;
import org.ecom.util.GetSqlConnection;

public class EmployeeService {
	private static Connection con = null;
	public EmployeeService() {
		con=GetSqlConnection.connectionOpen();
	}
	
	public List<Employee> getAllEmployee() {
		List<Employee> list = EmployeeRepository.getAllEmplyee(con);
		return list;
	}
	
	public List<Employee> findEmployeeByDate(String date) {
		List<Employee> list = EmployeeRepository.findEmployeeByDate(con, date);
		return list;
	}
	public Employee getEmployeeDetails(int id)
	{
		Employee employee=EmployeeRepository.getEmployeeDetails(con, id);
		return employee;
	}
	public int deleteEmployee(int id)
	{
		int executeUpdate=EmployeeRepository.deleteEmployee(con, id);
		return executeUpdate;
	}
	
	public void createEmployee(Employee employee)
	{
		EmployeeRepository.createEmployee(con, employee);
		return;
	}
	public void closeConnection() {
		GetSqlConnection.connectionClose();
	}
}
