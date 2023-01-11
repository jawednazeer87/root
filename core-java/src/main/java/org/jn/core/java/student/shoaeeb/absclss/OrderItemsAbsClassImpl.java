package org.jn.core.java.student.shoaeeb.absclss;

public class OrderItemsAbsClassImpl extends OrderItemsAbsClass{

	@Override
	public void setOrderId(int orderId) {
		// TODO Auto-generated method stub
		this.orderId=orderId;
		
	}

	@Override
	public void setProductId(int productId) {
		// TODO Auto-generated method stub
		this.productId=productId;
	}

	@Override
	public void setQuantity(int quantity) {
		// TODO Auto-generated method stub
		this.quantity=quantity;
	}

	@Override
	public int getOrderId() {
		// TODO Auto-generated method stub
		return this.orderId;
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return this.quantity;
	}

	@Override
	public int getProductId() {
		// TODO Auto-generated method stub
		return this.productId;
	}

}
