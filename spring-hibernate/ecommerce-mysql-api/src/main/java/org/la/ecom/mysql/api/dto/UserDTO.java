package org.la.ecom.mysql.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 4708793901475556163L;
	
	private int id;
	private boolean active;
	private String email;
	private String fullName;
	private String firstName;
	private String lastName;
	private String membershipNum;
	private String contactNum;
	private Date dob;
	private int status;
	private String passwordGame;
	private String passwordUser;
	private Set<RoleDTO> roles;
	private String dobString;
	private String roleName;
	
	public UserDTO() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean getActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMembershipNum() {
		return membershipNum;
	}
	public void setMembershipNum(String membershipNum) {
		this.membershipNum = membershipNum;
	}
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getPasswordGame() {
		return passwordGame;
	}

	public void setPasswordGame(String passwordGame) {
		this.passwordGame = passwordGame;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}
	public void setRoles(Set<RoleDTO> roles) {
		this.roles = roles;
	}

	public String getDobString() {
		return dobString;
	}

	public void setDobString(String dobString) {
		this.dobString = dobString;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}