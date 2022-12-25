package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class SmallestNumberWithoutIf {

	public static void main(String[] args) {
Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		int res;
		int num1 = myscanner.nextInt();
		int num2 = myscanner.nextInt();
		
		//Without If
		
		res = (num1<num2) ? (num1) : (num2);
		
		System.out.println("The smallest number between the two is " +res);
	}
}
