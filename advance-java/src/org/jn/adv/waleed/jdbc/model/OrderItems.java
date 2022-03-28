package org.jn.adv.waleed.jdbc.model;

/**
 * @author Waleed Rizq
 *
 * @date Mar 22, 2022
 */
public class OrderItems {
	
	private Integer orderId;
	private String productId;
	private Integer quantity;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderItems [orderId=" + orderId + ", productId=" + productId + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
	

}
