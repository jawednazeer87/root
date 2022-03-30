package org.jn.adv.student.moshin.jdbc.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.jn.adv.waleed.jdbc.model.Employee;
import org.jn.adv.waleed.jdbc.myutil.GetSqlConnection1;
import org.jn.adv.waleed.jdbc.repository.EmployeeRepository;


/**
 * @author Waleed Rizq
 *
 * @date Mar 13, 2022
 */
public class EmployeeService {
	
private Connection con = null;
	
	public EmployeeService() {
		con = GetSqlConnection1.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection1.connectionClose();
	}
	
  public Employee findById(int id){
		
		Employee employee = null;
		
		if(con!=null) {
			employee = EmployeeRepository.findById(con, id);
		}
		
		return employee;
	}
	
	public List<Employee> getAll(){
		List<Employee> employeeList = new ArrayList<>();
		if(con!=null) {
			employeeList = EmployeeRepository.getAll(con);
		}
		return employeeList;
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


}
