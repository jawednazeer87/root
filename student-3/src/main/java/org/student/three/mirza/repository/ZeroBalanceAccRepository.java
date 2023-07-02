//package org.student.three.mirza.repository;
//
//
//	
//	import java.util.List;
//
//	import org.springframework.data.jpa.repository.JpaRepository;
//	import org.springframework.data.jpa.repository.Query;
//	import org.student.three.mirza.modal.ZeroBalanceAcc;
//
//	public interface ZeroBalanceAccRepository extends JpaRepository<ZeroBalanceAccRepository, Long>{
//
//		@Query("SELECT u FROM ZeroBalanceAcc u WHERE u.name = ?1")
//		List <ZeroBalanceAcc> findByName(String name);
//		
//		ZeroBalanceAcc findByBankName(String bankName);
//
//		ZeroBalanceAcc save(ZeroBalanceAcc zeroBalanceAcc);
//		
//
//}