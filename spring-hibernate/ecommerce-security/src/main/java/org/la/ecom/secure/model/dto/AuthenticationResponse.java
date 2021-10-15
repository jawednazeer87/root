package org.la.ecom.secure.model.dto;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable{

	private static final long serialVersionUID = 3815188074358460426L;
	
	private final String jwt;

	public AuthenticationResponse(String jwt) {
		this.jwt = jwt;
	}
	
	public String getJwt() {
		return jwt;
	}
}
