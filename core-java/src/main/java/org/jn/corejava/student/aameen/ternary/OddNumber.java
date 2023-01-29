package org.jn.corejava.student.aameen.ternary;

import java.util.Scanner;
public class OddNumber {

	public static void main(String[] args) {
		// find the number is odd or not   using if and without if 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value ");
		int num1 =sc.nextInt();
		if(num1%2!=0)
			System.out.println("Odd number ");
		else
			System.out.println("Even number ");
		
		ternary(num1);
		

	}
	static void ternary(int num1)
	{
		String a = "odd " , b = "even";
		String num = num1%2!=0?a:b;
		System.out.println("Num is : " +num);
	}

}
