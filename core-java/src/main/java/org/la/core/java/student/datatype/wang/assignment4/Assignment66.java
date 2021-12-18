package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment66 {
    //66.	Wap to check whether a number is Prime number or not.

    public static void main(String[] args) {
        int num = 16;
        int i;
        for (i = 2; i <= num; i++) {
            if (num % i == 0) {
                break;
            }
        }
        if (i == num) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
