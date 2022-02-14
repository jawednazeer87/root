package org.la.core.java.student.wang.assignment8;

public class ProductVariantObj {
    public static void main(String[] args) {
        ProductVariant productVariant = new ProductVariant();
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
