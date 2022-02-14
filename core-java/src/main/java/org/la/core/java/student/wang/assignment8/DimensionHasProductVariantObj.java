package org.la.core.java.student.wang.assignment8;

public class DimensionHasProductVariantObj {
    public static void main(String[] args) {
        DimensionHasProductVariant dimensionHasProductVariant = new DimensionHasProductVariant();
        dimensionHasProductVariant.setDimensionId(1);
        dimensionHasProductVariant.setProductId(2);
        dimensionHasProductVariant.setVariantId(3);

        System.out.println("dimensionHasProductVariant.getDimensionId() = " + dimensionHasProductVariant.getDimensionId());
        System.out.println("dimensionHasProductVariant.getProductId() = " + dimensionHasProductVariant.getProductId());
        System.out.println("dimensionHasProductVariant.getVariantId() = " + dimensionHasProductVariant.getVariantId());
    }
}
