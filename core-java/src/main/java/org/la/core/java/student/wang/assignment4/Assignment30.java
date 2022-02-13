package org.la.core.java.student.wang.assignment4;

public class Assignment30 {
    //30.	wap to print all numbers between 1 to 150 multiple of 11.

    public static void main(String[] args) {

        for (int i = 1; i <= 150; i++) {
            if (i % 11 == 0) {
                System.out.println(i);
            }
        }
    }
}
