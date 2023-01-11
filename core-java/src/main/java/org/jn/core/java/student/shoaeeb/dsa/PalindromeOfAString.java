package org.jn.core.java.student.shoaeeb.dsa;

import java.util.Scanner;

public class PalindromeOfAString {
	public static boolean palindrome(String s)
	{
		boolean check=true;
		int n=s.length();
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=s.charAt(n-1-i))
			{
				check=false;
				return check;
			}
		}
		return check;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		s=sc.nextLine();
		sc.close();
		if(palindrome(s))
		{
			System.out.println(s+" is a palindrome");
		}
		else {
			System.out.println(s+" is not palindrome");
		}
			
		
	}

}
