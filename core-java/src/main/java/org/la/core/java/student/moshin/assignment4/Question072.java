package org.la.core.java.student.moshin.assignment4;

public class Question072 
{
	//72.	Wap to print all Perfect numbers between 1 to n.

    public static void main(String[] args) {


        for (int n = 1; n <= 100; n++) { //n is range
            int sum = 0;
            int i = 1;
            while (i <= n / 2) {
                if (n % i == 0) {
                    sum = sum + i;
                }
                i++;
            }
            if (sum == n) {
                System.out.println(n + " is a perfect number.");
            }
        }
      }
}

