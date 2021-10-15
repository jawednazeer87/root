package org.ecom.model;

import java.io.Serializable;
import java.util.Date;

public class CreditCard implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int cc_id;
	private String cc_num;
	private String holder_name;
	private Date expiry_date;
	
	public CreditCard() {}

	public int getCc_id() {
		return cc_id;
	}

	public void setCc_id(int cc_id) {
		this.cc_id = cc_id;
	}

	public String getCc_num() {
		return cc_num;
	}

	public void setCc_num(String cc_num) {
		this.cc_num = cc_num;
	}

	public String getHolder_name() {
		return holder_name;
	}

	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}

	public Date getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}
	
	@Override
	public String toString() {
		return "cc_id: "+cc_id+"   cc_num: "+cc_num+"   holder_name: "+holder_name+"   expiry_date: "+expiry_date;
	}
}

