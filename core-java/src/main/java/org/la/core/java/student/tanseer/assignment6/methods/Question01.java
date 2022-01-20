package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Scanner;

/*
 * Write a program with a method named getTotal that accepts two integers as an 
 * argument and return its sum. Call this method from main( ) and print the results.
	Show the answer.

 */
public class Question01 
{

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Enter first number: ");
        num1 = console.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = console.nextInt();
        
        int sum = getTotal(num1, num2);
        
        System.out.println("Sum: " + sum);
        
        console.close();
	}

	public static int getTotal(int number1, int number2)
    {
        return number1 + number2;
    }

}
