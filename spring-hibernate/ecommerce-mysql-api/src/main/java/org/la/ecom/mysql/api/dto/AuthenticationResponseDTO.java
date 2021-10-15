package org.la.ecom.mysql.api.dto;

import java.io.Serializable;

public class AuthenticationResponseDTO implements Serializable{

	private static final long serialVersionUID = -2709544070780856711L;
	
	private String jwt;

	public AuthenticationResponseDTO() {}
	
	public AuthenticationResponseDTO(String jwt) {
		this.jwt = jwt;
	}
	
	public String getJwt() {
		return jwt;
	}
	
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	
	@Override
	public String toString() {
		return "jwt: "+jwt;
	}
}
