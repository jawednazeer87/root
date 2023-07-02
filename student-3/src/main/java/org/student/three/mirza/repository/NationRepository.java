package org.student.three.mirza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.mirza.modal.Nation;


public interface NationRepository extends JpaRepository <Nation ,Long> {
	
	@Query("SELECT u FROM Nation u WHERE u.name = ?1")
	


List <Nation> findByName(String name);

Nation findByCode(long code);

List<Nation> findByContinentName(String continentName);

	
	

	

}
