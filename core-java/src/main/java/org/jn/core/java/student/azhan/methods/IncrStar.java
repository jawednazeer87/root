package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class IncrStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
		printIncrStar(n);
	}
	static void printIncrStar(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
