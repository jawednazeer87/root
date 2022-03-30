package org.jn.adv.student.moshin.jdbc.model;

import java.sql.Date;

/**
 * @author Waleed Rizq
 *
 * @date Mar 19, 2022
 */
public class MoneyDetail {
	
	private Integer id ;
	private Integer userid ;
	private  Double balance;
    private Date  date ;
	private Date updatedate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "MonyDetail [id=" + id + ", userid=" + userid + ", balance=" + balance + ", date=" + date
				+ ", updatedate=" + updatedate + "]"+"\r";
	}

	
}
