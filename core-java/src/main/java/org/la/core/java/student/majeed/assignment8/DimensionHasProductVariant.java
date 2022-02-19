package org.la.core.java.student.majeed.assignment8;

/*
29.	Create a class DimensionHasProductVariant having member variables dimensionId, productId, variantId. 
create getters and setters for all member variables. Create object of DimensionHasProductVariant class in 
other class inside main method and set all member values and print all member values using getters.
	*/

public class DimensionHasProductVariant {
    private int dimensionId; 
    private int productId;
    private int variantId;
    
	public int getDimensionId() {
		return dimensionId;
	}
	public void setDimensionId(int dimensionId) {
		this.dimensionId = dimensionId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getVariantId() {
		return variantId;
	}
	public void setVariantId(int variantId) {
		this.variantId = variantId;
	}
    
    
}
