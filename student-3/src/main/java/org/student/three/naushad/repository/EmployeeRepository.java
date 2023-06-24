package org.student.three.naushad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.student.three.naushad.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	List<Employee> findByCity(String city);

	List<Employee> findByState(String state);
}
