package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment68 {
    //68.	Wap to find sum of all prime numbers between 1 to n.

    public static void main(String[] args) {

        int numMax = 10;
        int i, sum = 0;
        for (int num = 2; num < numMax; num++) {
            boolean isPrime = false;

            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                System.out.println(num + " is a prime number");
                sum+=num;
            }

        }
        System.out.println("sum = " + sum);
    }
}