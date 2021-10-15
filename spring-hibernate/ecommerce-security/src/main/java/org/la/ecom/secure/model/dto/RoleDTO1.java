package org.la.ecom.secure.model.dto;

import java.io.Serializable;

public class RoleDTO1 implements Serializable{

	private static final long serialVersionUID = 9168308521845518252L;
	
	private int id;
	private String role;
	
	public RoleDTO1() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}