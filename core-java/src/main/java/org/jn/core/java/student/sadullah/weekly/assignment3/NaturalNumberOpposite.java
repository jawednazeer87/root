package org.jn.core.java.student.sadullah.weekly.assignment3;
import java.util.Scanner;

public class NaturalNumberOpposite {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Please enter a number to print natural numbers from to 1. (Only positive numbers)");
		
		int n = newscan.nextInt();
		
		printNatural(n);
	}
	static void printNatural(int n) {
		for (int i = n; i >= 1; i--) { 
            System.out.print(i + " "); 
        } 
	}
}