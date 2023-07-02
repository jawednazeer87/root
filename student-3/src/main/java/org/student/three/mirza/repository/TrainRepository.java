package org.student.three.mirza.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.student.three.mirza.modal.Train;


public interface TrainRepository extends JpaRepository<Train , Long> {
	@Query("SELECT u FROM Train u WHERE u. cityName = ?1")
		
	
	List <Train> findByCityName(String cityName);

	Train findByRoutName(String routName);

	List<Train> findByTrainNum(long trainNum);


	


}
