package org.la.core.java.student.tanseer.conditional.statements.assignment3;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) 
	{
		int num1 , num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 1st number :");
		num1 = sc.nextInt();
		
		System.out.println(" Enter 2nd number :");
		num2 = sc.nextInt();
		
		if (num1 > num2) 
		{
			System.out.println("1st number is Greatest: " + num1);
		} 
		else {
			System.out.println("2nd number is Greatest : " + num2);
		}
		
		sc.close();
	}

}
