package org.la.core.java.student.majeed.assignment6;

import java.util.Scanner;

public class P40TestEven {
	/*
	Write a method named isEven that accepts an int argument. 
	The method should return true if the argument is even, or false otherwise. 
	Also write a program to test your method.
	Show the answer.	 
	 */

	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num1;
	        
	        System.out.print("Enter a number: ");
	        num1 = console.nextInt();
	        
	        boolean result = isEven(num1);
	        
	        System.out.println("Result: " + result);
	    }

	    public static boolean isEven(int number1)
	    {
	    	boolean b = false;
	    	if(number1%2==0) {
	    		b=true;
	    	}
	        return b;
	    }
	}