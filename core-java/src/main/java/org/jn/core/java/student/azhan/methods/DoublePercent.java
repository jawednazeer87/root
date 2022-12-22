package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class DoublePercent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first subject marks: ");
		double a = sc.nextDouble();
		System.out.print("Enter second subject marks: ");
		double b = sc.nextDouble();
		System.out.print("Enter third subject marks: ");
		double c = sc.nextDouble();
		System.out.print("Enter fourth subject marks: ");
		double d = sc.nextDouble();
		System.out.print("Enter fifth subject marks: ");
		double e = sc.nextDouble();
		double res = percent(a,b,c,d,e);
		System.out.println("Percent = "+res);
	}
	static double percent(double x, double y, double z, double w, double v)
	{
		return (x+y+z+w+v)*100/500;
	}

}
