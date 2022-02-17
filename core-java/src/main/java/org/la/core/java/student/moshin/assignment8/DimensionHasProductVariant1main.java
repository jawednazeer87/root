package org.la.core.java.student.moshin.assignment8;

public class DimensionHasProductVariant1main {
    public static void main(String[] args) {
        DimensionHasProductVariant1 dimensionHasProductVariant = new DimensionHasProductVariant1();
        dimensionHasProductVariant.setDimensionId(1);
        dimensionHasProductVariant.setProductId(2);
        dimensionHasProductVariant.setVariantId(3);

        System.out.println("dimensionHasProductVariant.getDimensionId() = " + dimensionHasProductVariant.getDimensionId());
        System.out.println("dimensionHasProductVariant.getProductId() = " + dimensionHasProductVariant.getProductId());
        System.out.println("dimensionHasProductVariant.getVariantId() = " + dimensionHasProductVariant.getVariantId());
    }
}
