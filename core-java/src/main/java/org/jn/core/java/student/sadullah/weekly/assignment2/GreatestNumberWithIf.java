package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class GreatestNumberWithIf {

	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		int num1 = myscanner.nextInt();
		int num2 = myscanner.nextInt();
		
		//With if
		
		if (num1>num2) {
			System.out.println("The greatest number between the two is " +num1);
		}	else {
			System.out.println("The greatest number between the two is " +num2);
		}
	}
}
