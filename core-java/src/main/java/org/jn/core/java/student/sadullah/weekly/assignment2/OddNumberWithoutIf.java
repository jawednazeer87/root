package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class OddNumberWithoutIf {

	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		int res;
		int num1 = myscanner.nextInt();
		int num2 = myscanner.nextInt();
		
		//Without If
		
		res = (num1 % 2 != 0) ? (num1) : (num2);
		
		System.out.println("The odd number between the two is " +res);
	}
}