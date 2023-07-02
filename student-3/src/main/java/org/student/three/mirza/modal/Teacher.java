package org.student.three.mirza.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "teacher")
public class Teacher {
@Id

@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
@Column (name ="teacher_id")
private long teahcerId;
@Column (name ="name")
private String name;
@Column (name ="dob")
private Date dob;
@Column (name ="email")
private String email;
@Column (name ="school_id")
private long schoolId;
@Column (name ="father_name")
private String fatherName;


public Teacher () {}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public long getTeahcerId() {
	return teahcerId;
}


public void setTeahcerId(long teahcerId) {
	this.teahcerId = teahcerId;
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


public long getSchoolId() {
	return schoolId;
}


public void setSchoolId(long schoolId) {
	this.schoolId = schoolId;
}


public String getFatherName() {
	return fatherName;
}


public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}


@Override
public String toString() {
	return "  {id=" + id + ", teahcerId=" + teahcerId + ", name=" + name + ", dob=" + dob + ", email=" + email
			+ ", schoolId=" + schoolId + ", fatherName=" + fatherName + "}";
}


}


