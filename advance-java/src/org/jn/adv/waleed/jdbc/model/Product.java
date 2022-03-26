package org.jn.adv.waleed.jdbc.model;

import java.time.LocalDate;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class Product {
	
	private Integer id;
	private String merchantId;
	private String name;
	private Double price;
	private String status;
	private LocalDate createdAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", merchantId=" + merchantId + ", name=" + name + ", price=" + price + ", status="
				+ status + ", createdAt=" + createdAt + "]";
	}
   
	   
	
	
	
}
