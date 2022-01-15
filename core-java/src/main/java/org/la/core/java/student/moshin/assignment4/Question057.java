package org.la.core.java.student.moshin.assignment4;

public class Question057 
{
	//57.	Wap to find sum of first and last digit of a number.

    public static void main(String[] args) {

        int num = 523345,
                firstDigit = 0,
                lastDigit = 0,
                sum;
        lastDigit = num % 10;

        while (num > 9) {
            num = num / 10;
            firstDigit = num;
        }
        sum = firstDigit + lastDigit;
        System.out.println("firstDigit = " + firstDigit);
        System.out.println("lastDigit = " + lastDigit);
        System.out.println("sum = " + sum);
    }
}

