package org.jn.adv.student.tanseer.jdbc.dto;

import java.io.Serializable;

public class ProductsDTO implements Serializable
{
	private static final long serialVersionUID = -1443814004539007341L;
	private Integer merchantId;
	private String name;
	private Integer price;
	private boolean status;
	private String createdAt;
	private String statusValue;
	
	public Integer getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
		statusValue = status? "Moving" : "Holding";
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getStatusValue() {
		setStatusValue(statusValue);
		return statusValue;
	}
	public void setStatusValue(String statusValue) {
		
		if(statusValue==null) {
			this.statusValue = status ? "Moved" : "Holding";
		}
		else {
			this.statusValue = statusValue;
		}
	}
	
	@Override
	public String toString() {
		setStatusValue(statusValue);
		return " {Merchant ID : "+merchantId+" Name : "+name+" Price : "+price+" Status : "+statusValue+" Created At : "+createdAt+ "} "+"\r";
	}
	
	
}
