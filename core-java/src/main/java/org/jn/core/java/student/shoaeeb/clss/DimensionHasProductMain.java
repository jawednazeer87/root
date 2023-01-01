package org.jn.core.java.student.shoaeeb.clss;

public class DimensionHasProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DimensionHasProductVariant dm = new DimensionHasProductVariant();
		dm.setDimensionId(1);
		dm.setProductId(5);
		dm.setVariantId(6);
		System.out.println("Dimension: "+dm.getDimensionId()+" Product Id: "+dm.getProductId()+" Variant Id: "+dm.getVariantId());
	}

}
