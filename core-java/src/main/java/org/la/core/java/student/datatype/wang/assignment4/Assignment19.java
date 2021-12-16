package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment19 {
    //19.	wap to print all numbers between 30 to 80 those are divisible by 6 and 5.

    public static void main(String[] args) {

        for (int i = 30; i <= 80; i++) {
            if (i % 6 == 0 && i % 5 ==0) {
                System.out.println(i);
            }
        }
    }
}
