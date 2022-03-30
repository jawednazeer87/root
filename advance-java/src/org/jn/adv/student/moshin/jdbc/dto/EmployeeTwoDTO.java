package org.jn.adv.student.moshin.jdbc.dto;

import java.util.Date;

/**
 * @author Waleed Rizq
 *
 * @date Mar 19, 2022
 */
public class EmployeeTwoDTO {
	private Integer id;
	private String name;
	private Date dob;
	private String email;
	private  Boolean gender;
	private Date joinedDate;
	private Date releasedDate;
	private Integer noticePeriod;
	private Date createdate;
	private Date updateDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public Date getReleasedDate() {
		return releasedDate;
	}
	public void setReleasedDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}
	public Integer getNoticePeriod() {
		return noticePeriod;
	}
	public void setNoticePeriod(Integer noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "EmployeeTwo [id=" + id + ", name=" + name + ", dob=" + dob + ", email=" + email + ", gender=" + gender
				+ ", joinedDate=" + joinedDate + ", releasedDate=" + releasedDate + ", noticePeriod=" + noticePeriod
				+ ", createdate=" + createdate + ", updateDate=" + updateDate + "]"+"\r";
	}
	
	

}
