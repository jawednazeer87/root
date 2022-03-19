package org.jn.adv.waleed.jdbc.model;

import java.util.Date;

/**
 * @author Waleed Rizq
 *
 * @date Mar 19, 2022
 */
public class CreditCard {
	private Integer ccId ;
	private String  ccNum ;
	private  String holderName;
	private  Date   expiryDate;
	public Integer getCcId() {
		return ccId;
	}
	public void setCcId(Integer ccId) {
		this.ccId = ccId;
	}
	public String getCcNum() {
		return ccNum;
	}
	public void setCcNum(String ccNum) {
		this.ccNum = ccNum;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "CreditCard [ccId=" + ccId + ", ccNum=" + ccNum + ", holderName=" + holderName + ", expiryDate="
				+ expiryDate + "]"+"\r";
	}
	
	

}
