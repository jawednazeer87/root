package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * double div(int, int) - divide first argument with second argument and return the result

 */
public class Program18DivideTwoArguments 
{

	public static void main(String[] args) 
	{
		int a = 7;
		int b = 8;
		double ans = div(a, b);
		System.out.println("Division of "+a+" * "+b+" = "+ans);
	}
	
	static double div(int num1 , int num2)
	{
		int div = num1 / num2;	
		return div;
	}
}

