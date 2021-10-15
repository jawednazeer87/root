package org.la.ecom.msql.repository;

import java.util.List;

import org.la.ecom.msql.model.MailFormat;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MailFormatRepository extends JpaRepository<MailFormat, Long>{
	
	List<MailFormat> findByMailTypeId(int mailTypeId);
	
}