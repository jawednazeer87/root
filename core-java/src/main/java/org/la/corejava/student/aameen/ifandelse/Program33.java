package org.la.corejava.student.aameen.ifandelse;

import java.util.Scanner;
public class Program33 {

	public static void main(String[] args) {
		// wap to find a given number is negative or not?
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the number : ");
		int num = sc.nextInt();
		
		if(num<0)
			System.out.println("Negative Number");
		else
			System.out.println("It is not a negative number ");
		

	}

}
