package org.jn.corejava.student.aameen.ternary;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// wap to print smallest number among two given numbers( with if and without if).
Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the first number :");
		int num1=sc.nextInt();
		
		System.out.println("Enter the Second number :");
		int num2=sc.nextInt();
		
		int smallestnum = (num1<num2)? num1:num2;
		System.out.println("Smallest number between two using ternary operator : "+ smallestnum);
		
		usingifelse(num1 , num2);
	}
	static void usingifelse(int firstnum, int secondnum)
	{
		if(firstnum<secondnum)
		{
			System.out.println("Smallestnum number between two using if and else is : "+firstnum);
		}
		else
			System.out.println("Smallestnum number between two using if and else is : "+secondnum);
	}

	}


