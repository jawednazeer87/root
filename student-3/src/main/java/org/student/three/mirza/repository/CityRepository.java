package org.student.three.mirza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.mirza.modal.City;

public interface CityRepository   extends JpaRepository<City, Long> {

@Query("SELECT u FROM City u WHERE u.city = ?1")
		
	
	List <City> findByCity(String city);
		
	City findById(int id);

}
