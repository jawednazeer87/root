package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms: ");
		int n = sc.nextInt();
		fibonacci(n);
	}
	static void fibonacci(int n)
	{
		int a=0, b=1, c;
		System.out.print("0, 1, ");
		for(int i=0; i<n-2; i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+", ");
		}
		
	}

}
