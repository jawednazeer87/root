package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * double average(int, int, int) - find average of formal arguments and return result
 */
public class Program19Average 
{

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 30;
		double ans = average(a, b , c);
		System.out.println("average of "+a+" "+b+" "+c+ " = "+ans);
	}
	
	static double average(int num1 , int num2 , int num3)
	{
		int average = (num1 + num2 + num3) / 3;	
		return average;
	}
}

