package org.la.core.java.student.tanseer.assignment3.conditional.statements;
import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) 
	{
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a number to check whether positive , negative or zero : ");
		num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("Number "+ num +" is negative");
		}
		else if(num >0) {
			System.out.println("Number "+ num +" is positive");
		}
		else if(num == 0) {
			System.out.println("Number "+ num +" is zero");
		}
		
		sc.close();
		
	}

}
