package org.student.three.mirza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.mirza.modal.Manager;

public interface ManagerRepository   extends JpaRepository <Manager,  Long> {
	
@Query("SELECT u FROM Manager u WHERE u.name = ?1")
		
	
	List <Manager> findByName(String name);
		
	Manager findByEmail(String email);


}
