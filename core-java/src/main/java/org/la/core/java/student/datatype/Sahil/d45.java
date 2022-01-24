package org.la.core.java.student.datatype.Sahil;

public class d45 {
    public static void main(String[] args) {

        int a = 12 + 21 * 3 - 9 / 2; 
        int b = 14 - 32 * 4 + 175 / 8 - 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        if (++a > 71 && --b < 20) {
            System.out.println("a = " + a + " b = " + b);
        }
        if (b-- == -97 || a-- < 100) {
            System.out.println("a = " + a + " b = " + b);
        }
    }
}
