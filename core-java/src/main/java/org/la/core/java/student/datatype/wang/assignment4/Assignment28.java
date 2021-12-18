package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment28 {
    //28.	wap to print all numbers between 10 to 300 those are divisible by 11 and 12.
    public static void main(String[] args) {

        for (int i = 10; i <= 300; i++) {
            if (i % 12 == 0 && i % 11 == 0) {
                System.out.println(i);
            }
        }
    }
}
