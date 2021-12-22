
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment72 {
    /*
72	46. wap to find greatest number among three numbers
    */
    public static void main(String[] args) {
        int a = 18, b = 11, c = 14;
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is greatest number");
            } else {
                System.out.println(c + " is greatest number");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is greatest number");
            } else {
                System.out.println(c + " is greatest number");
            }
        }
    }
}