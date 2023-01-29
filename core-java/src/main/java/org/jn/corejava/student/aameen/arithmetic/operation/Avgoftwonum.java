package org.jn.corejava.student.aameen.arithmetic.operation;

import java.util.Scanner;
public class Avgoftwonum {

	public static void main(String[] args) {
		// wap to find the avg of two number 
		float num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		num1=sc.nextFloat();
		System.out.println("Enter the second number : ");
		num2=sc.nextFloat();
		float avg = num1+num2/2;
		System.out.println("Avg of two number :"+avg);
	}

}
