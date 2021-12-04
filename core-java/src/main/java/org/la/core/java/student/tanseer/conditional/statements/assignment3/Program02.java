package org.la.core.java.student.tanseer.conditional.statements.assignment3;
import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) 
	{
		double num1 , num2 , num3 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 1st number :");
		num1 = sc.nextDouble();
		System.out.println(" Enter 2nd number :");
		num2 = sc.nextDouble();
		System.out.println(" Enter 3rd number :");
		num3 = sc.nextDouble();
		if ((num1 > num2) && (num1 > num3)) 
		{
			System.out.println("Greatest amongst 3 number is : " +num1);
	
		} 
		else if( (num2 > num1) && (num2 > num3))
		{
			System.out.println("Greatest amongst 3 number is : " +num2);
		}
		else if((num3 > num1) && (num3 > num2)){
			System.out.println("Greatest amongst 3 number is : " +num3);
		}
		sc.close();
	}

}
