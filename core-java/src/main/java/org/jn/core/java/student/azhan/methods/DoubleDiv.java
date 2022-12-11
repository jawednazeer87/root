package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class DoubleDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first nummber: ");
		double a = sc.nextDouble();
		System.out.print("Enter second nummber: ");
		double b = sc.nextDouble();
		double res = div(a,b);
		System.out.println("Result = "+res);
	}
	static double div(double x, double y)
	{
		return x/y;
	}
}
