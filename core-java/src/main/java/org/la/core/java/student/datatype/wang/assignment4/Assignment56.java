package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment56 {
    //56.	Wap to find first and last digit of a number.

    public static void main(String[] args) {

        int num = 123345,
                firstDigit = 0,
                lastDigit = 0;
        lastDigit = num % 10;

        while (num > 9) {
            num = num / 10;
            firstDigit = num;
        }
        System.out.println("firstDigit = " + firstDigit);
        System.out.println("lastDigit = " + lastDigit);
    }
}
