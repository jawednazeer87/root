package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment18 {
    //18.	wap to print all numbers between 130 to 90 those are not divisible by 10.

    public static void main(String[] args) {

        for (int i = 90; i <= 130; i++) {
            if (i % 10 != 0) {
                System.out.println(i);
            }
        }
    }
}
