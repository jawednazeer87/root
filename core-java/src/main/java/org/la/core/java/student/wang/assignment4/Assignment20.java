package org.la.core.java.student.wang.assignment4;

public class Assignment20 {
    //20.	wap to print all numbers between 10 to 50 those are divisible by 2 and 5.
    public static void main(String[] args) {

        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0 && i % 5 ==0) {
                System.out.println(i);
            }
        }
    }
}
