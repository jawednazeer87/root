package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class LongFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter nummber: ");
		int a = sc.nextInt();
		int fact = factorial(a);
		System.out.println("Factorial = "+fact);
	}
	static int factorial(int x)
	{
		int fact = 1;
		while(x>0)
			fact = fact * x--;
		return fact;
	}
}
