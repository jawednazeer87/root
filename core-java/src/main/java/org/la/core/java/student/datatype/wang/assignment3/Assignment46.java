package org.la.core.java.student.datatype.wang.assignment3;

public class Assignment46 {
    //    46. wap to find greatest number among three numbers
    public static void main(String[] args) {
        int a = 1, b = 11, c = 111;
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is greatest");
            } else {
                System.out.println(c + " is greatest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is greatest");
            } else {
                System.out.println(c + " is greatest");
            }
        }
    }
}