package org.la.core.java.student.wang.assignment8;

public class ColorsObj {
    public static void main(String[] args) {
        Colors colors = new Colors();

        colors.setId(1);
        colors.setColorName("blue");

        System.out.println("colors.getId() = " + colors.getId());
        System.out.println("colors.getColorName() = " + colors.getColorName());
    }
}
