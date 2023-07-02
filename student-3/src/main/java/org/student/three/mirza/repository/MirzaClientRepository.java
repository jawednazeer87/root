package org.student.three.mirza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.mirza.modal.Client;

public interface MirzaClientRepository  extends  JpaRepository  < Client , Long> {
	
@Query("SELECT u FROM Client u WHERE u.name = ?1")
		
	
	  List <Client> findByName(String name);
		
	Client findByEmail(String email);

	Client getReferenceByName(String name);


}
