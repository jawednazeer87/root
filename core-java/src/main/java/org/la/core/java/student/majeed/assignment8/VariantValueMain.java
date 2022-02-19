package org.la.core.java.student.majeed.assignment8;

import org.la.core.java.student.wang.assignment8.VariantValue;

/*
30.	Create a class VariantValue having member variables productId, optionId, valueId, dimensionId, variantId, price, sku. 
create getters and setters for all member variables. Create object of VariantValue class in other class inside main method 
and set all member values and print all member values using getters.
	*/

public class VariantValueMain {
    public static void main(String[] args) {
        VariantValue variantValue = new VariantValue();
        variantValue.setProductId(1);
        variantValue.setOptionId(10);
        variantValue.setValueId(100);
        variantValue.setDimensionId(500);
        variantValue.setVariantId(2);
        variantValue.setPrice(65465);
        variantValue.setSku(200);

        System.out.println("ProductId: " + variantValue.getProductId());
        System.out.println("OptionId: " + variantValue.getOptionId());
        System.out.println("ValueId: " + variantValue.getValueId());
        System.out.println("DimensionId: " + variantValue.getDimensionId());
        System.out.println("VariantId: " + variantValue.getVariantId());
        System.out.println("Price: " + variantValue.getPrice());
        System.out.println("Sku: " + variantValue.getSku());

    }	
}
