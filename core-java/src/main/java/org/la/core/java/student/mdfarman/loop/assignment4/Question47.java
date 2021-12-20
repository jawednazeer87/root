package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question47 {
	
//	47.	Wap to print all natural numbers in reverse (from n to 1).
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int end = 1 ; 
		System.out.println("Enter number");
		int start = sc.nextInt();
		
		for (int i = start ; i>=end  ; i--)
		{
			System.out.println(i);
		}
		
	}
}
