package org.la.corejava.student.aameen.arithmetic.operation;

import java.util.Scanner;
public class Avgofthreenum {

	public static void main(String[] args) {
		// wap to find average of 3 numbers?
		float  num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		num1=sc.nextFloat();
		System.out.println("Enter the second number :");
		num2=sc.nextFloat();
		System.out.println("Enter theb third number :");
		num3=sc.nextFloat();
		float avg = num1+num2+num3/3;
		System.out.println("Avg of three number :" +avg);


	}

}
