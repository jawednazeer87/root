package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * void fibonocci(int)
		print fibonacci series 
		
		a b c
		0 1 1 2 3 5 8
		  a	b
		  
 */
public class Program23Fibonacci 
{

	public static void main(String[] args) 
	{
		fibonacci(15);
	}
	
	static void fibonacci(int n)
	{
		int a = 0;
		int b = 1 , c;
		
		System.out.print(a+" "+b+" ");
		
		for(int i = 1; i <= n; i++)
		{
			c = a + b;
			System.out.print(c+" ");
			
			a = b;
			b = c;
			
		}
	}
}

