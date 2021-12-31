package org.la.core.java.student.tanseer.assignment4.loops;

// Fibonacci Series 
// a b c
// 0 1 1 2 3 5 8 
//   a b

public class Program42FibonacciAnotherMethod 
{

	public static void main(String[] args) 
	{
		int a = 0 , b = 1 ;
		System.out.print(a + " "+ b + " ");
		
		for(int i = 0 ; i < 10 ; i++  ) 
		{
			int c = a + b;
			System.out.print(c + " ");
			a = b ;
			b = c ;
		}

	}
}