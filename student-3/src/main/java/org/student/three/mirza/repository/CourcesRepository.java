package org.student.three.mirza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.mirza.modal.Cources;

public interface    CourcesRepository   extends  JpaRepository<Cources, Long> {
	
@Query("SELECT u FROM Cources u WHERE u.name = ?1")
		
	
	List <Cources> findByName(String name);
		
	

	Cources findByInstituteName(String instituteName);


}
