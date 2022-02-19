package org.la.core.java.student.majeed.assignment8;

/*
24.	Create a class ProductVariant having member variables variantId, productId, finishId, colorsId, metadata, thumbnails. 
create getters and setters for all member variables. Create object of ProductVariant class in other class inside main 
method and set all member values and print all member values using getters.
*/

public class ProductVariantMain {

    public static void main(String[] args) {
        ProductVariant productVariant = new ProductVariant();
        productVariant.setVariantId(11);
        productVariant.setProductId(12);
        productVariant.setFinishId(13);
        productVariant.setColorsId(5);
        productVariant.setMetadata("My metadata");
        productVariant.setThumbnails("TABLE");

        System.out.println("VariantId = " + productVariant.getVariantId());
        System.out.println("ProductId = " + productVariant.getProductId());
        System.out.println("FinishId = " + productVariant.getFinishId());
        System.out.println("ColorsId = " + productVariant.getColorsId());
        System.out.println("Metadata = " + productVariant.getMetadata());
        System.out.println("Thumbnails = " + productVariant.getThumbnails());
    }	
}
