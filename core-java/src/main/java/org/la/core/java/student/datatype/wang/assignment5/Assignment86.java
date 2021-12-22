
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment86 {
    /*

     */
    public static void main(String[] args) {
        int a = 7 * 3 + 6 / 2 - 5; //a = 19

        int b = 21 - 8 + a % 3 * 11; //b = 24

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        if (a < b) {
            System.out.println("A is less than B");
        }
        if (a == b) {
            System.out.println("A is equal to B");
        }
        if (a > b) {
            System.out.println("A is greater than B");
        }
    }
}