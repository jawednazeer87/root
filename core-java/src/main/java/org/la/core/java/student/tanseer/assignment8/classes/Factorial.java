package org.la.core.java.student.tanseer.assignment8.classes;

public class Factorial 
{

	 int factorial(int num)
	{
		int fact = 1;
		for(int i = num ; i > 0 ; i--)
		{
			fact = fact * i;
		}
		
		return fact;
	}
	
	public static void main(String[] args) 
	{
		int f;
		
		Factorial factorial = new Factorial();
		f = factorial.factorial(5);
		
		System.out.println("Factorial is :"+f);
	}
	
}
