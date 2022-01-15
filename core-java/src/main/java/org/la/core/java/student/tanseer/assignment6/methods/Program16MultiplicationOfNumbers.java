package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * int mul(int, int) - multiply two numbers and return result

 */
public class Program16MultiplicationOfNumbers 
{

	public static void main(String[] args) 
	{
		int a = 7;
		int b = 8;
		int ans = mul(a, b);
		System.out.println("Multiplication of "+a+" * "+b+" = "+ans);
	}
	
	static int mul(int num1 , int num2)
	{
		int mul = num1 * num2;	
		return mul;
	}
}

