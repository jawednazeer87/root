package org.la.core.java.student.moshin.assignment4;

public class Question071 
{
	//71.	Wap to check whether a number is Perfect number or not.

    public static void main(String[] args) {

        int n = 28, sum = 0;
        int i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println(n + " is a perfect number.");
        } else
            System.out.println(n + " is not a perfect number.");
      }
}

