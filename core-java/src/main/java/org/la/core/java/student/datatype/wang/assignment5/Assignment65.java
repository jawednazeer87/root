
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment65 {
    /*
 65	40.	wap to find factorial of a given number
    */
    public static void main(String[] args) {
        int num=5;
        int factorial=1;
        for (int i = 1; i <= 5; i++) {
           factorial*=i;
        }
        System.out.println("factorial = " + factorial);
    }
}
