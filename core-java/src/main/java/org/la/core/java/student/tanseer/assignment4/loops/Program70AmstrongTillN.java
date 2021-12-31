package org.la.core.java.student.tanseer.assignment4.loops;

// Check whether a number is Armstrong

public class Program70AmstrongTillN 
{
	public static void main(String[] args) 
	{
		int num ;
		for(num = 1 ; num < 1000 ; num ++)
		{
			int count = 0;
			int t = num ;
			int sum = 0;
			
			while(num > 0) 
			{
				num = num / 10;
				count ++;
			}
			// System.out.println(count);
			
			num = t;
			while(num > 0) 
			{
				int r = num % 10 ;
				sum = sum + (int)Math.pow(r, count);
				num = num / 10;
			}
			num = t ;
			if( t == sum) 
			{
				System.out.println(num +" is Armstrong");
			}
//			else
//				System.out.println(num +" is not Armstrong");
		}	
	}		
}