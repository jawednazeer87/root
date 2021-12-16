package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment67 {
    //67.	Wap to print all Prime numbers between 1 to n.

    public static void main(String[] args) {

        int numMax = 16;

        int i;
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
            }
        }
    }
}