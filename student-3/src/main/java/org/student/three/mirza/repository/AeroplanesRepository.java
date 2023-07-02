package org.student.three.mirza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.mirza.modal.Aeroplanes;
// import org.student.three.mirzaa.service.AeroplaneService;


public interface AeroplanesRepository extends JpaRepository<Aeroplanes , Long>{

@Query 
("SELECT u FROM Aeroplanes u WHERE u.companyName  =?1")

List <Aeroplanes> findByName(String name);


void deleteById(AeroplanesRepository aeroplaneRepository);
}

