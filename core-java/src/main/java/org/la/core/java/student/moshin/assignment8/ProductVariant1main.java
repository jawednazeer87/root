package org.la.core.java.student.moshin.assignment8;

public class ProductVariant1main {
	
	public static void main(String[] args) {
		ProductVariant1 productVariant = new ProductVariant1();
        productVariant.setVariantId(1);
        productVariant.setProductId(2);
        productVariant.setFinishId(1);
        productVariant.setColorsId(4);
        productVariant.setMetadata(true);
        productVariant.setThumbnails(false);

        System.out.println("productVariant.getVariantId() = " + productVariant.getVariantId());
        System.out.println("productVariant.getProductId() = " + productVariant.getProductId());
        System.out.println("productVariant.getFinishId() = " + productVariant.getFinishId());
        System.out.println("productVariant.getColorsId() = " + productVariant.getColorsId());
        System.out.println("productVariant.isMetadata() = " + productVariant.isMetadata());
        System.out.println("productVariant.isThumbnails() = " + productVariant.isThumbnails());
    }
}
