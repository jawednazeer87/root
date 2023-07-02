package org.student.three.mirza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.mirza.modal.Teacher;

public interface TeacherRepository extends JpaRepository <Teacher , Long> {
	
	@Query("SELECT u FROM Teacher u WHERE u.fatherName = ?1")
	
	List<Teacher> findByFatherName(String fatherName);
	
	Teacher findByEmail(String email);
	

}
