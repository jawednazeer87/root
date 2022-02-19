package org.la.core.java.student.tanseer.assignment8.classes;
/*
 * create a class of name Arithmetic, add methods like add, sub, div, prod, fibonacci, prime, 
 * factorial.Plz make these methods return type and arguments according to your wish.
 */
public class Arithmetic 
{
	public int add(int a ,int b, int c)
	{
		
		return (a+b+c);
	}
	
	public int sub(int a ,int b, int c)
	{
		
		return (a-b-c);
	}
	
	public int div(int a, int b)
	{
		return (a/b);
	}
	
	public int prod(int a, int b)
	{
		return (a*b);
	}
	
	public void fibonacci(int n)
	{
		int a = 0;
		int b = 1;
		System.out.print(a +" "+ b+ " ");
		
		for(int i = 1 ; i <= n ; i++)
		{
			int c = a + b;
			System.out.print(c +" ");
			
			a = b;
			b = c;
		}	
	}
	
	public void factorial(int n)
	{
		int fact = 1;
		for(int i = 1 ; i <= n; i++)
		{
			fact = fact * i;	
		}
		System.out.println("Factorial is : "+ fact);
	}
	
	public void  prime(int n)
	{
		boolean flag = true;
		for(int i = 2; i <= n/2 ; i++)
		{
			if(n % i == 0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println(" Is a Prime Number : "+ n);
		else
			System.out.println("Not a prime number : "+n);
			
	}
}
