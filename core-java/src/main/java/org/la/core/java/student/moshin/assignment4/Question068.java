package org.la.core.java.student.moshin.assignment4;

public class Question068 
{
	//68.	Wap to find sum of all prime numbers between 1 to n.

    public static void main(String[] args) {

        int numMax = 10;
        int i, sum = 0;
        for (int num = 2; num < numMax; num++) {

            for (i = 2; i <= num ; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                System.out.println(num + " is a prime number");
                sum+=num;
            }

        }
        System.out.println("sum = " + sum);
    }
}

