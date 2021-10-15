package org.la.att.system.response.model;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable{

	private static final long serialVersionUID = 3448686509793353717L;
	
	private String sessionTime;
	private final String jwt;

	public AuthenticationResponse(String jwt) {
		this.jwt = jwt;
	}
	
	public AuthenticationResponse(String jwt, String sessionTime) {
		this.jwt = jwt;
		this.sessionTime = sessionTime;
	}
	
	public String getJwt() {
		return jwt;
	}

	public String getSessionTime() {
		return sessionTime;
	}

	public void setSessionTime(String sessionTime) {
		this.sessionTime = sessionTime;
	}
	
}
