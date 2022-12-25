package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class StarReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
		printStarReverse(n);
	}
	static void printStarReverse(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
