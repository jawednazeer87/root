package org.la.ecom.msql.repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.la.ecom.msql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findByEmail(String email);
	
	List<User> findByMailSentStatus(int mailSent);
	
	@Query("SELECT u FROM User u WHERE u.status = 1")
	Collection<User> findAllActiveUsers();
	
	@Query("SELECT u FROM User u WHERE u.email != ?1")
	Collection<User> findAllUsersExceptGivenEmail(String email);
	
}