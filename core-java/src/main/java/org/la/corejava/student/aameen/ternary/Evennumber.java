package org.la.corejava.student.aameen.ternary;

import java.util.Scanner;
public class Evennumber {

	public static void main(String[] args) {
		// wap to print even number by  given numbers( with if and without if).
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int firstnum = sc.nextInt();
		if(firstnum%2==0)
		{
			System.out.println("Even number ");
		}
		else
			System.out.println("Odd number ");
		
		ternaryoper(firstnum);
	}
	static void ternaryoper(int firstnum)
	{
		String num1 = "even" , num2 = "odd";
		String numis = firstnum%2==0?num1:num2;
		System.out.println("Number is : "+numis);
	}

}
