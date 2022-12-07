package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first nummber: ");
		int a = sc.nextInt();
		System.out.print("Enter second nummber: ");
		int b = sc.nextInt();
		System.out.print("Enter third nummber: ");
		int c = sc.nextInt();
		double res = average(a,b,c);
		System.out.println("Average = "+res);
	}
	static double average(int x, int y, int z)
	{
		return (x+y+z)/3;
	}

}
