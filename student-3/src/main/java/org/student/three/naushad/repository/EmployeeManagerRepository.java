package org.student.three.naushad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.student.three.naushad.model.EmployeeManager;

public interface EmployeeManagerRepository extends JpaRepository<EmployeeManager, Long> {

	EmployeeManager findByEmail(String email);
}
