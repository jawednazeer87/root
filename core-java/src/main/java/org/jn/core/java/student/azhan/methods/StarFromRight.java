package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class StarFromRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
		printStarFromRight(n);
	}
	static void printStarFromRight(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j<=n-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
