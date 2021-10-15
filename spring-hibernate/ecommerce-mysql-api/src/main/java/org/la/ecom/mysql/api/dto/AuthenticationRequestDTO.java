package org.la.ecom.mysql.api.dto;

import java.io.Serializable;

public class AuthenticationRequestDTO implements Serializable{

	private static final long serialVersionUID = 8992433360750434038L;
	
	private String username;
	private String password;
	
	public AuthenticationRequestDTO() {}
	
	public AuthenticationRequestDTO(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}