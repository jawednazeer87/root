package org.student.three.mirza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.mirza.modal.MonitorWide;

public interface MonitorWideRepository   extends JpaRepository <MonitorWide , Long>{
@Query("SELECT u FROM MonitorWide u WHERE u. orgName = ?1")
		
	
	List <MonitorWide> findByOrgName(String orgName);
		
MonitorWide findByModelNo(String modelNo );

	
	

}
