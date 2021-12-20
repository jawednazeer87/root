package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question46 {
	
//		46.	Wap to print all natural numbers from 1 to n.

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start = 1 ; 
		System.out.println("Enter number");
		int end = sc.nextInt();
		
		for (int i = 1 ; i<= end ; i++)
		{
			System.out.println(i);
		}
		
	}
}
