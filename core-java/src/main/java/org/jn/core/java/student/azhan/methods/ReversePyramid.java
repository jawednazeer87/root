package org.jn.core.java.student.azhan.methods;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
		reversePyramid(n);
	}
	static void reversePyramid(int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(j<=i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			for(int j=1; j<n-i; j++)
					System.out.print("*");
			System.out.println();
		}
	}

}
