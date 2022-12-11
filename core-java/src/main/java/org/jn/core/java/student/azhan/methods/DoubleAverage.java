package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class DoubleAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first nummber: ");
		double a = sc.nextDouble();
		System.out.print("Enter second nummber: ");
		double b = sc.nextDouble();
		System.out.print("Enter third nummber: ");
		double c = sc.nextDouble();
		double res = average(a,b,c);
		System.out.println("Average = "+res);
	}
	static double average(double x, double y, double z)
	{
		return (x+y+z)/3;
	}

}
