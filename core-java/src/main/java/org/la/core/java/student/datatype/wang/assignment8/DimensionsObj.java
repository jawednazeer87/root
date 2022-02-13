package org.la.core.java.student.datatype.wang.assignment8;

public class DimensionsObj {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions();
        dimensions.setId(2);
        dimensions.setDimensionValue(200);

        System.out.println("dimensions.getId() = " + dimensions.getId());
        System.out.println("dimensions.getDimensionValue() = " + dimensions.getDimensionValue());
    }
}
