package org.jn.core.java.student.shoaeeb.practiceset;

import java.util.Scanner;

public class Program4 {
	//prime or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean check=true;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		sc.close();
		if(n==1)
			check=false;
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
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not prime number");
		}
	}

}
