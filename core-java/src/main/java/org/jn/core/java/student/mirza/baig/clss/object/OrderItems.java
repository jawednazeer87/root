package org.jn.core.java.student.mirza.baig.clss.object;

public class OrderItems {

	private  int orderId;
	private String  productId;
	
	private int  quantity;
	
	public void setOrderId(int orderId) {
		
		this.orderId=orderId;
	}
	public int getOrderId() {
		return orderId;
		
	}
	public void setProductId(String productId) {
		
		this.productId=productId;
	}
	
	public String getproductId() {
		return productId;
		
	}
	public void setQuantity(int quantity) {
		
		this.quantity=quantity;
	}
	public int getQuantity() {
		return quantity;
	
	}
}










//Create a class OrderItems having member variables orderId, productId, quantity. create getters and 
//setters for all member variables. Create object of OrderItems class in other class inside main method and set 
//all member values and print all member values using getters.