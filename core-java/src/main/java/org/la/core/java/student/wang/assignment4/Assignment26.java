package org.la.core.java.student.wang.assignment4;

public class Assignment26 {

    public static void main(String[] args) {
//26.	wap to print all numbers between 200 to 1 those are divisible by 13 and 2.
        for (int i = 1; i <= 200; i++) {
            if (i % 13 == 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
