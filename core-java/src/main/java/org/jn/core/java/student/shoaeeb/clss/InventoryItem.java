package org.jn.core.java.student.shoaeeb.clss;

import java.util.Date;
import java.util.Objects;

public class InventoryItem {
	private int UUID;
	private int invItem;
	private String title;
	private double price;
	private Date purchaseDate;
	public int getUUID() {
		return UUID;
	}
	public void setUUID(int uUID) {
		UUID = uUID;
	}
	public int getInvItem() {
		return invItem;
	}
	public void setInvItem(int invItem) {
		this.invItem = invItem;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(UUID, invItem, price, purchaseDate, title);
	}
	
	@Override
	public String toString() {
		return "InventoryItem [UUID=" + UUID + ", invItem=" + invItem + ", title=" + title + ", price=" + price
				+ ", purchaseDate=" + purchaseDate + "]";
	}
	@Override
	public boolean equals(Object that) {
		if (this == that)
			return true;
		if (that == null)
			return false;
		if (that == null||getClass() != that.getClass())
			return false;
		InventoryItem other = (InventoryItem) that;
		return this.UUID == other.UUID && this.invItem == other.invItem
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(purchaseDate, other.purchaseDate) && Objects.equals(title, other.title);
	}
	
	
	
	
}
