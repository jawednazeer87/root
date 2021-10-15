package org.la.ecom.secure.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax. persistence. FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable{
	
	private static final long serialVersionUID = 46492583981549739L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="password")
	private String password;
	
	@Column(name="active")
	private boolean active;
	
	@Column(name="email")
	private String email;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="membership_num")
	private String membershipNum;
	
	@Column(name="contact_num")
	private String contactNum;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="status")
	private int status;
	
	@Column(name="mail_sent_status")
	private int mailSentStatus;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
	
	public User() {}
	
	public User(User user) {
		this.id = user.getId();
		this.password = user.getPassword();
		this.active = user.getActive();
		this.email = user.getEmail();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.membershipNum = user.getMembershipNum();
		this.contactNum = user.getContactNum();
		this.dob = user.getDob();
		this.status = user.getStatus();
		this.roles = user.getRoles();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean getActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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

	public int getMailSentStatus() {
		return mailSentStatus;
	}

	public void setMailSentStatus(int mailSentStatus) {
		this.mailSentStatus = mailSentStatus;
	}
	
	@Override
	public String toString() {
		return id+ "  " +firstName+"  "+email;
	}
}