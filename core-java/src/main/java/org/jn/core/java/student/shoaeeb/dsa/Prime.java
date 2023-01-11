package org.jn.core.java.student.shoaeeb.dsa;


import java.lang.Math;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prime or not
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		sc.close();
		boolean check=true;
		
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i==0)
			{
				check=false;
				break;
			}
		}
		if(check)
		{
			System.out.println(n+ "is a prime number");
		}
		else {
			System.out.println(n+" not a prime number");
		}
	}

}
