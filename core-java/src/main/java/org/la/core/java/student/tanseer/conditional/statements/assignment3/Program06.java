package org.la.core.java.student.tanseer.conditional.statements.assignment3;
import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) 
	{
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is multiple of 10 or not :");
		num = sc.nextInt();
		
		if (num % 10 == 0) {
			System.out.println("The number " +num+ " is a multiple of 10");
		} else {
			System.out.println("The number " +num+ " is not a multiple of 10");
		}
		sc.close();
	}

}
