package org.la.core.java.student.waleed.homework.methods.assignment6;

import java.util.Scanner;

public class SumTwoNumber {

	public static void main(String[] args) {

		 Scanner console = new Scanner(System.in);
		 int num1, num2;
		 System.out.print("Enter first number: ");
		 num1 = console.nextInt();
		 System.out.print("Enter second number: ");
		 num2 = console.nextInt();
		 int sum= getTotal(num1, num2);
		 System.out.println("Sum = "+sum);
	}
	 public static int getTotal(int num1, int num2) {
		 return num1+num2;

	}

}
