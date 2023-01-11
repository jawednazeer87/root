package org.jn.core.java.student.shoaeeb.dsa;

import java.util.Scanner;
public class PalindromeNumber {

	public static int palindromeNum(int n)
	{
		int rev=0;
		int rem;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		n=sc.nextInt();
		sc.close();
		int originalNum=n;
		int palindrome = palindromeNum(n);
		if(originalNum==palindrome)
		{
			System.out.println(originalNum+ " is a palindrome");
		}
		else {
			System.out.println(originalNum+" is not a palindrome ");
		}
	}

}
