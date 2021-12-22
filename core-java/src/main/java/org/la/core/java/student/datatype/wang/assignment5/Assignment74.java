
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment74 {
    /*
74	48. wap to find least number among three numbers
    */
    public static void main(String[] args) {
        int a = 18, b = 11, c = 1;
        if (a < b) {
            if (a < c) {
                System.out.println(a + " is least number");
            } else {
                System.out.println(c + " is least number");
            }
        } else {
            if (b < c) {
                System.out.println(b + " is least number");
            } else {
                System.out.println(c + " is least number");
            }

        }

    }
}