package org.la.att.system.repository;

import java.util.List;

import org.la.att.system.model.BlackListToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlackListTokenRepository extends JpaRepository<BlackListToken, Integer>{
	
	List<BlackListToken> findByToken(String token);

}
