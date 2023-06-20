package org.student.three.arsallan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.arsallan.model.Aeroplane;

public interface AeroplaneRepository extends JpaRepository<Aeroplane, Long> {
	
	@Query("SELECT u FROM Aeroplane u WHERE u.name = ?1")
	List<Aeroplane> findByName(String name);
	
	List<Aeroplane> findByModel(String mdoel);
	
}
