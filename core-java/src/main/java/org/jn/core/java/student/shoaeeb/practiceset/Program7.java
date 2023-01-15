package org.jn.core.java.student.shoaeeb.practiceset;

import java.util.Scanner;

public class Program7 {
	
	//fibonacci series
	public static int fib(int n)
	{
		if(n==1|| n==0)
			return n;
		else {
			return fib(n-1)+fib(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		for(int i=0; i<n; i++)
		{
			System.out.println(fib(i));
		}
	}

}
