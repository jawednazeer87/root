package org.student.three.mirza.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.mirza.modal.Users;


public interface UsersRepository extends JpaRepository<Users , Long> {
	@Query("SELECT u FROM Users u WHERE u.firstName = ?1")
	
	
	List <Users> findByFirstName(String firstName);
	
	Users findByEmail(String email);

	
	


	}
	


