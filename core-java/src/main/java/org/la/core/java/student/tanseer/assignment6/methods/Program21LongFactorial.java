package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * long factorial(int)
		find factorial of given argument and return result

 */
public class Program21LongFactorial 
{

	public static void main(String[] args) 
	{
		long n = factorial(5);
		System.out.println(n);
	}
	
	static long factorial(int num)
	{
		int fact = 1;
		
		if(num == 1)
		{
			int n = 1;
			System.out.println("Factorial of "+num+" is "+n);
		}
		
		for(int i = num; i > 0; i--)
		{
			fact = fact * i ;
		}
		
		System.out.print("Factorial of "+num+" is " );
		return fact;
	}
}

