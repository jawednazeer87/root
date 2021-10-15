package org.ecom.service;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.Employeefive;
import org.ecom.repository.EmployeefiveRepository;
import org.ecom.util.GetSqlConnection;

public class EmployeefiveService {

	private Connection con = null;

	public EmployeefiveService() {
		con = GetSqlConnection.connectionOpen();
	}

	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}

	public List<Employeefive> getAllEmployeefives() {

		List<Employeefive> empList = new ArrayList<>();

		if (con != null) {
			empList = EmployeefiveRepository.getAllEmployee(con);
		}

		return empList;
	}

	public Employeefive findeEmployeefiveById(long id) {

		Employeefive emp = null;

		if (con != null) {
			emp = EmployeefiveRepository.findEmpById(con, id);
		}

		return emp;
	}

	public int deleteEmpById(long empId) {
		return EmployeefiveRepository.deleteEmpById(con, empId);
	}

	public void createEmp(Employeefive emp) {
		EmployeefiveRepository.createEmp(con, emp);
	}

	public void updateEmp(Employeefive emp) {
		EmployeefiveRepository.updateEmp(con, emp);
	}

	public List<Employeefive> getempByName(String name) {
		return EmployeefiveRepository.getempByName(con, name);
	}

	public List<Employeefive> getempByAge(Date fromDobDate, Date toDobDate) {
		return EmployeefiveRepository.getempByAge(con, fromDobDate, toDobDate);
	}

	public List<Employeefive> getempByJoinedDate(Date fromJoinedDate, Date toJoinedDate) {
		return EmployeefiveRepository.getempByJoinedDate(con, fromJoinedDate, toJoinedDate);
	}

	public List<Employeefive> getempByReleaseDate(Date fromReleaseDate, Date toReleaseDate) {
		return EmployeefiveRepository.getempByReleaseDate(con, fromReleaseDate, toReleaseDate);
	}

	public List<Employeefive> getempByEmailId(String emailid) {
		return EmployeefiveRepository.getempByEmailId(con, emailid);
	}

	public List<Employeefive> getempByNoticePeriod(int noticePeriod) {
		return EmployeefiveRepository.getempByNoticePeriod(con, noticePeriod);
	}

	public List<Employeefive> getempByGender(String gender) {
		return EmployeefiveRepository.getempByGender(con, gender);
	}
}
