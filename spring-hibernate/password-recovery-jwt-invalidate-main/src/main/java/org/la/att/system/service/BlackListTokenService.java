package org.la.att.system.service;

import java.util.List;

import org.la.att.system.model.BlackListToken;
import org.la.att.system.repository.BlackListTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlackListTokenService {

	@Autowired
	private BlackListTokenRepository blackListTokenRepository;
	
	public List<BlackListToken> findByToken(String token) {
		return blackListTokenRepository.findByToken(token);
	}
	
	public BlackListToken save(BlackListToken blackListToken) {
		return blackListTokenRepository.save(blackListToken);
	}
	
	public boolean isTokenBlackListed(String token) {
		List<BlackListToken> blackListTokenList = blackListTokenRepository.findByToken(token);
		return blackListTokenList!=null && !blackListTokenList.isEmpty();
	}
}
