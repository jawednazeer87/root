package org.student.three.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	@Query("SELECT u FROM User u WHERE u.firstName = ?1")
	List<User> findByFirstName(String firstName);
	
	User findByEmail(String email);

}
