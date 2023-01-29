package org.jn.corejava.student.aameen.arithmetic.operation;

import java.util.Scanner;
public class Avgoffournum {

	public static void main(String[] args) {
		// wap to find average of 4 numbers?
		float num1,num2,num3,num4;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number : ");
		num1=sc.nextFloat();
		System.out.println("Enter the secnod number :");
		num2=sc.nextFloat();
		System.out.println("Enter the third number :");
		num3=sc.nextFloat();
		System.out.println("Enter the fourth number :");
		num4=sc.nextFloat();
		float avg = num1+num2+num3+num4/4;
		System.out.println("Avg of four number: "+avg);

	}

}
