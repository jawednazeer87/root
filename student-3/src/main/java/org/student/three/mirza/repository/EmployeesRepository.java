package org.student.three.mirza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.mirza.modal.Employees;

public interface EmployeesRepository  extends JpaRepository< Employees , Long> {

@Query("SELECT u FROM Employees u WHERE u.employeeName = ?1")
		
	
	List <Employees> findByEmployeeName(String employeeName);
		
	Employees findByEmployeeNum(String employeeNum);

}
