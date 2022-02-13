package org.la.core.java.student.wang.assignment4;

public class Assignment55 {
    //55.	Wap to count number of digits in a number.

    public static void main(String[] args) {

        int num = 12345, count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
