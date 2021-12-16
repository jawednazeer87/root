package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment59 {
    //59.	Wap to calculate sum of digits of a number.

    public static void main(String[] args) {

        int num = 1234, sum = 0;
        while (num > 9) {
            sum = num % 10 + sum;
            num = num / 10;
        }
        sum = sum + num;
        System.out.println(sum);
    }
}
