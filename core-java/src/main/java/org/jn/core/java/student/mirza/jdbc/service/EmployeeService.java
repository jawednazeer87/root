package org.jn.core.java.student.mirza.jdbc.service;



	import java.sql.Connection;
	import java.util.List;

	
	import org.jn.core.java.jawed.jdbc.repository.UserRepository;
	import org.jn.core.java.jawed.jdbc.util.GetSqlConnection;
    import org.jn.core.java.student.mirza.jdbc.model.Employee;
import org.jn.core.java.student.mirza.jdbc.repository.EmployeeRepository;
	
	//public class EmployeeService {

	
		
		//private Connection con = null;
		
		//public EmployeeService() {
		//	con = GetSqlConnection.connectionOpen();
		//}
		
		//public void connectionClose() {
		////	GetSqlConnection.connectionClose();
		//}
		
//		public List<Employee> getAllUser(){
//			return EmployeeRepository.getAllEmployee(con);
//		}
//		
//		public Employee findEmployeeById(int id){
//			return EmployeeRepository.findUserById(con, id);
//		}
//		
//		public int deleteEmployeeById(int Id) {
//			return EmployeeRepository.deleteEmployeeById(con, Id);
//		}
//		
//		public void createUser(Employee Employee) {
//			UserRepository.createEmployee(con, Employee);
//		}
//		
//		
//		public void updateEmployee(Employee employee) {
//			EmployeeRepository.updateEmployee(con, employee);
//		}
//		
//		public List<User> getUserByName(String name){
//			return UserRepository.getUserByName(con, name);
//
//
//}