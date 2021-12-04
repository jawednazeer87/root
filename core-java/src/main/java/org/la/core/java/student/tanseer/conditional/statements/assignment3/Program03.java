package org.la.core.java.student.tanseer.conditional.statements.assignment3;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) 
	{
		int num ;
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" Enter a number to find odd or even :");
		 num = sc.nextInt();
		 
		 if (num % 2 == 0) {
			System.out.println("The number " +num +" is even \n");
		} else {
			System.out.println("The number " +num +" is odd \n");
		}
		 sc.close();
	}

}
