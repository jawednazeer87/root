package org.ecom.service;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.ecom.model.EmployeeTwo;
import org.ecom.repository.EmployeeTwoRepository;
import org.ecom.util.GetSqlConnection;


public class EmployeeTwoService {
	
	private Connection con = null;

	public EmployeeTwoService() {
		con = GetSqlConnection.connectionOpen();
	}

	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}

	public List<EmployeeTwo> getAllEmployeeTwo() {

		List<EmployeeTwo> employeetwoList = new ArrayList<>();

		if (con != null) {
			employeetwoList = EmployeeTwoRepository.getAllEmployeeTwo(con);
		}

		return employeetwoList;
	}

	public EmployeeTwo findEmployeeTwoById(long employeetwoid) {

		EmployeeTwo employeetwo = null;

		if (con != null) {
			employeetwo = EmployeeTwoRepository.findEmployeeTwoById(con, employeetwoid);
		}

		return employeetwo;
	}
	
	public List<EmployeeTwo> getEmployeeTwoByName(String employeetwoname) {
		return EmployeeTwoRepository.getEmployeeTwoByName(con, employeetwoname);
	}
	
	public List<EmployeeTwo> getEmployeeTwoByEmailId(String employeetwoemail) {
		return EmployeeTwoRepository.getEmployeeTwoByEmail(con, employeetwoemail);
	}
	
	
	public List<EmployeeTwo> getempByNoticePeriod(int noticePeriod) {
		return EmployeeTwoRepository.getEmployeeTwoByNoticePeriod(con, noticePeriod);
	}

	public List<EmployeeTwo> getempByGender(String gender) {
		return EmployeeTwoRepository.getEmployeeTwoByGender(con, gender);
	}
	
	
	public List<EmployeeTwo> findEmployeeTwoByDob(Date fromDobDate, Date toDobDate){
		return EmployeeTwoRepository.findEmployeeTwoByDob(con, fromDobDate, toDobDate);
	}
	
	public List<EmployeeTwo> findByJoinedDate(Date fromJoinedDate, Date toJoinedDate){
		return EmployeeTwoRepository.findEmployeeTwoByJoinedDate(con, fromJoinedDate, toJoinedDate);
	}
	
	public List<EmployeeTwo> findEmployeeTwoByReleaseDate(Date fromReleaseDate, Date toReleaseDate){
		return EmployeeTwoRepository.findByReleaseDate(con, fromReleaseDate, toReleaseDate);
	}
	
	public int deleteEmployeeTwoById(long employeetwoid) {
		return EmployeeTwoRepository.deleteEmployeeTwoById(con, employeetwoid);
	}

	public void createEmployeeTwo(EmployeeTwo employeetwo) {
		EmployeeTwoRepository.createEmployeeTwo(con, employeetwo);
	}

	public void updateEmployeeTwo(EmployeeTwo employeetwo) {
		EmployeeTwoRepository.updateEmployeeTwo(con, employeetwo);
	}
	
}
