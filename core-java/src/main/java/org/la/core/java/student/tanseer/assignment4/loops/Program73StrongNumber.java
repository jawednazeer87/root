package org.la.core.java.student.tanseer.assignment4.loops;

public class Program73StrongNumber 
{
	public static void main(String[] args) 
	{
		int num = 145 ;
		int fac, sum = 0;
        int temp = num;
        
        while (num > 0) {
            fac = 1;
            int r = num % 10;
            for (int i = r; i >= 1; i--)
                fac = fac * i;
            
            sum = sum + fac;
            num = num / 10;
        }

        if (sum == temp)
            System.out.println(temp + " is strong Number");
        else
            System.out.println(temp + " is not a Strong Number");

	}		
}