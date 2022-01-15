package org.la.core.java.student.moshin.assignment4;

public class Question074 
{
	//74.	Wap to print all Strong numbers between 1 to n.

    public static void main(String[] args) {
        int i, N = 1000000000;
        for (i = 0; i < N; i++) {
            int num = i;
            int fac, sum = 0;
            int temp = num;
            while (num != 0) {
                fac = 1;
                int r = num % 10;
                //calculating factorial of r
                for (int j = r; j >= 1; j--)
                    fac = fac * j;
                //storing sum of factorial of all digits of the number
                sum = sum + fac;
                num = num / 10;
            }

            if (sum == temp)
                System.out.println(temp + " is strong Number");

        }
     }
}

