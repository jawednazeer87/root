package org.jn.adv.student.tanseer.jdbc.model;

import java.io.Serializable;

public class Products implements Serializable {
	
	private static final long serialVersionUID = -1443814004539007341L;
	private Integer merchantId;
	private String name;
	private Integer price;
	private boolean status;
	private String createdAt;
	
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
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	@Override
	public String toString() {
		return " {Merchant ID : "+merchantId+" Name : "+name+" Price : "+price+" Status : "+status+" Created At : "+createdAt+ "} ";
	}
	
}
