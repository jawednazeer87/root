package org.la.core.java.student.tanseer.assignment3.conditional.statements;
import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) 
	{
		int num , num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check divisibility : ");
		num = sc.nextInt();
		System.out.println("Divisibility number : ");
		num1 = sc.nextInt();
		
		if (num % num1 == 0) {
			System.out.println("Entered number "+num + " is divisible by " + num1);
			
		} else {
			System.out.println("Entered number "+num + " is not divisible by " + num1);
		}
		sc.close();
	}

}
