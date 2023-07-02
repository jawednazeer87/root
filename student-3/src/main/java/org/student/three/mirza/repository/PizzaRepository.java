package org.student.three.mirza.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.mirza.modal.Pizza;

public interface PizzaRepository  extends  JpaRepository <Pizza ,Long> {
@Query("SELECT u FROM Pizza u WHERE u.name = ?1")
		
List<Pizza> findByName(String name);


	Pizza findByType(String type);


	List<Pizza> findByCreatedDate(Date createdDate);

	

	

	

}
