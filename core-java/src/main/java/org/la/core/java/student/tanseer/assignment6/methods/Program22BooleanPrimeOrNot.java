package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * boolean prime(int)
	check whether given number is prime or not and return true or false

 */
public class Program22BooleanPrimeOrNot 
{

	public static void main(String[] args) 
	{
		boolean num = prime(20);
		System.out.println(num);
	}
	
	static boolean prime(int n)
	{
		boolean result = true;
		for(int i = 2; i < n ; i++)
		{
			if(i % 2 == 0)
			{
				result = false;
				break;
			}
		}
		return result;
	}
}

