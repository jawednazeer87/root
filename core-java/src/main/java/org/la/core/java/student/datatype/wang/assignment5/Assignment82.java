
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment82 {
    /*

     */
    public static void main(String[] args) {
        boolean a, b, c;
        a = b = c = true;
        if (!a || (b && c)) { //false||(true && true)>>true
            System.out.println("If executed");
        } else {
            System.out.println("else executed");
        }
    }
}