package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class GreatestNumber3 {

	public static void main(String[] args) {
Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		
		int num1 = myscanner.nextInt();
		int num2 = myscanner.nextInt();
		int num3 = myscanner.nextInt();
				
		if (num1>num2) {
			System.out.println("The greatest number between the three is " +num1);
		}	else if (num2 > num3){
			System.out.println("The greatest number between the three is " +num2);
		} else {
			System.out.println("The greatest number between the three is " +num3);
		}
	}
}
