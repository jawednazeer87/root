package org.la.core.java.student.moshin.assignment4;

public class Question073 
{
	//73.	Wap to check whether a number is Strong number or not.
	//1! + 4! + 5! = 1 + 24 + 120 = 145.
	    public static void main(String[] args) {

	        int num = 145;
	        int fac, sum = 0;
	        int temp = num;
	        while (num != 0) {
	            fac = 1;
	            int r = num % 10;
	            //calculating factorial of r
	            for (int i = r; i >= 1; i--)
	                fac = fac * i;
	            //storing sum of factorial of all digits of the number
	            sum = sum + fac;
	            num = num / 10;
	        }

	        if (sum == temp)
	            System.out.println(temp + " is strong Number");
	        else
	            System.out.println(temp + " is not a Strong Number");
      }
}

