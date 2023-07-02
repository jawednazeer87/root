package org.student.three.mirza.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@ Entity
@ Table (name ="mgr")
public class Manager {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
   @Column (name ="name")
   private String name;
   @Column (name ="dob")
   private Date dob;
   @Column (name ="email")
   private String email;
   
   public Manager() {}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "  {id=" + id + ", name=" + name + ", dob=" + dob + ", email=" + email + "}";
}
   
   

}
