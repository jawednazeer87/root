package org.jn.core.java.student.shoaeeb.jdbc.dto;

import java.util.Date;

public class CartDto {

	private int UUID;
	private String state;
	private Date createDate;
	private int quantity;
	public int getUUID() {
		return UUID;
	}
	public void setUUID(int uUID) {
		UUID = uUID;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Cart [UUID=" + UUID + ", state=" + state + ", createDate=" + createDate + ", quantity=" + quantity
				+ "]";
	}
	
	
	
}
