package org.la.core.java.student.majeed.assignment8;

/*
29.	Create a class DimensionHasProductVariant having member variables dimensionId, productId, variantId. 
create getters and setters for all member variables. Create object of DimensionHasProductVariant class in 
other class inside main method and set all member values and print all member values using getters.
	*/

public class DimensionHasProductVariantMain {
	
	public static void main(String[] args) {
		DimensionHasProductVariant dimensionHasProductVariant = new DimensionHasProductVariant();
		
		dimensionHasProductVariant.setDimensionId(1);
		dimensionHasProductVariant.setProductId(101);
		dimensionHasProductVariant.setVariantId(10);
		
		System.out.println(dimensionHasProductVariant.getDimensionId());
		System.out.println(dimensionHasProductVariant.getProductId());
		System.out.println(dimensionHasProductVariant.getVariantId());
	
}
}
