
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment79 {
    /*
79	53. wap to check whether a given number is positive and double digit or single digit number
    */
    public static void main(String[] args) {
        int a = -9;
        if (a > 0) {
            if (a < 10) {
                System.out.println(a + " is positive and single digit number");
            } else if (a < 100 && a > 9) {
                System.out.println(a + " is positive and two digit number");
            }
        } else {
            if (a > -10) {
                System.out.println(a + " is negative and single digit number");
            } else if (a > -100 && a < -9) {
                System.out.println(a + " is negative and two digit number");
            }
        }
    }
}