package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class OddNumberWithIf {

	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);

		System.out.println("Enter two numbers");

		int num1 = myscanner.nextInt();
		int num2 = myscanner.nextInt();

		boolean both = (num1 % 2 != 0) && (num2 % 2 != 0);

		//With if


		if (both) {
			System.out.println("Both the numbers are odd");
		}
		else if (num1 % 2 != 0) {
			System.out.println("The odd number between the two is " +num1);
		}	else if (num2 % 2 != 0){
			System.out.println("The odd number between the two is " +num2);
		} else {
			System.out.println("No odd numbers between the two.");
		}
	}
}
