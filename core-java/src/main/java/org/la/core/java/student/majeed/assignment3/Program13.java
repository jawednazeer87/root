package org.la.core.java.student.majeed.assignment3;

public class Program13 {

	public static void main(String[] args) {
		// 13.	Write a program to check whether a given character is lowercase ( a to z ) or uppercase ( A to Z ).
		char i = 'Z';
		int j = (int)i;
		if (j >= 65 && j<= 90) 
		System.out.println("it is uppercase");	
		
		if (j >= 97 && j<= 122) 
		System.out.println("it is lowercase");			
	}

}
