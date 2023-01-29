package org.jn.corejava.student.aameen.ternary;

import java.util.Scanner;

public class Positivenumber {

	public static void main(String[] args) {
		// wap to print positive number among two given numbers( with if and without if).
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 =sc.nextInt();
		int positivenum = (num2>0)?num2:num1;
		System.out.println("Positive number among two number is : "+positivenum);

	
	
	if(num1>0)
	{
		System.out.println("Positive number between two number is : "+num1);
	}
	else
		System.out.println("Positive number between two number is :"+num2);
	}
	}


