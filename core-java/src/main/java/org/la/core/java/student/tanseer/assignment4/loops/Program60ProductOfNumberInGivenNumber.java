package org.la.core.java.student.tanseer.assignment4.loops;

import java.util.Scanner;

public class Program60ProductOfNumberInGivenNumber {

	public static void main(String[] args) {
		int prod = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		
		int temp = num ;
		
		while(temp != 0) 
		{
			prod = prod *(temp % 10);
			temp = temp / 10;
			
		}
		System.out.println("Product of all digits in " + num + " : " + prod);
	}
}