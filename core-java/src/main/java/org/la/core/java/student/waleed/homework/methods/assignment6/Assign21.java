package org.la.core.java.student.waleed.homework.methods.assignment6;

import java.util.Scanner;

public class Assign21 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		long f = factorialNumb( n);
		System.out.println("Factorial of "+n+" is: "+f);  
	}
	  static long  factorialNumb(int n) {
		int fact =1;
		for(int i = n ; i>=1 ; i--) {
			System.out.println(i+"*"+fact);  
			fact = i * fact;
			
		}
		return fact;
		
		

	}

}
