package org.ecom.model;

import java.io.Serializable;
import java.util.Date;

public class MoneyDetail implements Serializable{

	private static final long serialVersionUID = -1582067386243719716L;

	public MoneyDetail() {}
	
	private int id;
	private int userid;
	private double balance;
	private Date createdate;
	private Date updatedate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	@Override
	public String toString() {
		return "id: "+id+"   userid : "+userid +"   balance : "+balance +"   createdate : "+createdate
				+"   updatedate : "+updatedate;
	}
}