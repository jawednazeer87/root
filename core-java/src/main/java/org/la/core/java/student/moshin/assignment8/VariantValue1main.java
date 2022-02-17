package org.la.core.java.student.moshin.assignment8;

public class VariantValue1main {
	public static void main(String[] args) {
		VariantValue1 variantValue = new VariantValue1();
        variantValue.setProductId(1);
        variantValue.setOptionId(2);
        variantValue.setValueId(3);
        variantValue.setDimensionId(2);
        variantValue.setVariantId(3);
        variantValue.setPrice(100);
        variantValue.setSku(1001);

        System.out.println("variantValue.getProductId() = " + variantValue.getProductId());
        System.out.println("variantValue.getOptionId() = " + variantValue.getOptionId());
        System.out.println("variantValue.getValueId() = " + variantValue.getValueId());
        System.out.println("variantValue.getDimensionId() = " + variantValue.getDimensionId());
        System.out.println("variantValue.getVariantId() = " + variantValue.getVariantId());
        System.out.println("variantValue.getPrice() = " + variantValue.getPrice());
        System.out.println("variantValue.getSku() = " + variantValue.getSku());

    }
}
