package org.jn.adv.student.moshin.jdbc.model;

public class Order_items {

	private Integer order_id;
	private Integer product_id;
	private Integer quantity;

	/**
	 * @return the order_id
	 */
	public Integer getOrder_id() {
		return order_id;
	}

	/**
	 * @param order_id the order_id to set
	 */
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	/**
	 * @return the product_id
	 */
	public Integer getProduct_id() {
		return product_id;
	}

	/**
	 * @param product_id the product_id to set
	 */
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		
		return "{order_id: "+order_id+", product_id: "+product_id+", quantity: "+quantity+" }";
	}
}