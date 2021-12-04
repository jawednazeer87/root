package org.la.core.java.student.mdfarman.conditional.statement.assignment3;

public class Question13 {

	public static void main(String[] args) {
//			13.	Write a program to check whether a given character is lowercase ( a to z )
//		or uppercase ( A to Z ).
//		Hint: u can use ascii value to solve this issue
		
		char ch =  'a';
		if(ch >= 97 && ch < 123)
			System.out.println("lowercase");
		else if (ch >= 65 && ch < 91)
			System.out.println("upper case");
		else
			System.out.println("out of range");
		
		
        

	}

}
