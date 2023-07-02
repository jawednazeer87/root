package org.student.three.mirza.repository;

	
	

	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
	import org.student.three.mirza.modal.Zoo;

	public interface ZooRepository extends JpaRepository<Zoo, Long>{

		@Query("SELECT u FROM Zoo u WHERE u.name = ?1")
		List <Zoo> findByName(String name);
		
		Zoo findByEmailZooAuthority(String emailZooAuthority);

	}

	


