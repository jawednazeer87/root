package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first nummber: ");
		int a = sc.nextInt();
		System.out.print("Enter second nummber: ");
		int b = sc.nextInt();
		int res = mul(a,b);
		System.out.println("Result = "+res);
	}
	static int mul(int x, int y)
	{
		return x*y;
	}
 
}
