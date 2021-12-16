package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment65 {
    //65.	Wap to calculate factorial of a number.

    public static void main(String[] args) {
        int a = 5, b = 1, result = 1;
        for (a = 5; a >= b; a--) {
            result *= a;
        }
        System.out.println("result = " + result);//5*4*3*2*1
    }
}
