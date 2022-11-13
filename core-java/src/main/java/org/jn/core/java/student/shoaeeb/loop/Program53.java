package org.jn.core.java.student.shoaeeb.loop;

import java.util.Scanner;

public class Program53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		int sum=0;
		for(int i=1; i<=a; i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}

}
