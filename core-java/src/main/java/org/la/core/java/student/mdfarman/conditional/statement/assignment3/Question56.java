package org.la.core.java.student.mdfarman.conditional.statement.assignment3;

public class Question56 {

	public static void main(String[] args) {

//		56. wap to print all these on basis of give character value
//		'A' -> Capital
//		'a' -> small

		char ch =  'A';
		if (ch >= 'A' && ch <= 'Z')
			System.out.println("Capital");
		else if( ch >='a' && ch <= 'z')
			System.out.println("small");
		else 
			System.out.println("Out of range");
		
		
	}

}