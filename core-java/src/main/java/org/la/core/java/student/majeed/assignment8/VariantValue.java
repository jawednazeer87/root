package org.la.core.java.student.majeed.assignment8;

/*
30.	Create a class VariantValue having member variables productId, optionId, valueId, dimensionId, variantId, price, sku. 
create getters and setters for all member variables. Create object of VariantValue class in other class inside main method 
and set all member values and print all member values using getters.
	*/

public class VariantValue {
	
	private int productId;
	private int optionId;
	private int valueId;
	private int dimensionId; 
	private int variantId; 
	private int price;
	private int sku;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
	public int getValueId() {
		return valueId;
	}
	public void setValueId(int valueId) {
		this.valueId = valueId;
	}
	public int getDimensionId() {
		return dimensionId;
	}
	public void setDimensionId(int dimensionId) {
		this.dimensionId = dimensionId;
	}
	public int getVariantId() {
		return variantId;
	}
	public void setVariantId(int variantId) {
		this.variantId = variantId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSku() {
		return sku;
	}
	public void setSku(int sku) {
		this.sku = sku;
	}
}
