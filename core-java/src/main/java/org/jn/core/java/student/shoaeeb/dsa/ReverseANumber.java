package org.jn.core.java.student.shoaeeb.dsa;

import java.util.*;
public class ReverseANumber {

	public static int reverseNum(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		sc.close();
		System.out.println("Original Number: "+n);
		int rev=reverseNum(n);
		System.out.println(rev);
	}

}
