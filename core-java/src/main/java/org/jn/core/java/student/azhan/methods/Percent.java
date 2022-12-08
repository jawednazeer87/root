package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class Percent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first subject marks: ");
		int a = sc.nextInt();
		System.out.print("Enter second subject marks: ");
		int b = sc.nextInt();
		System.out.print("Enter third subject marks: ");
		int c = sc.nextInt();
		System.out.print("Enter fourth subject marks: ");
		int d = sc.nextInt();
		System.out.print("Enter fifth subject marks: ");
		int e = sc.nextInt();
		double res = percent(a,b,c,d,e);
		System.out.println("Percent = "+res);
	}
	static double percent(int x, int y, int z, int w, int v)
	{
		return (x+y+z+w+v)*100/500;
	}

}
