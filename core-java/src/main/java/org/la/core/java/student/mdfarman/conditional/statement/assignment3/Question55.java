package org.la.core.java.student.mdfarman.conditional.statement.assignment3;

public class Question55 {

	public static void main(String[] args) {

//		55. wap to print 'capital' if given character is capital letter, 
//		else print 'small' if charater is in lower case

		char ch =  'A';
		if (ch >= 'A' && ch <= 'Z')
			System.out.println("Capital");
		else if( ch >='a' && ch <= 'z')
			System.out.println("small");
		else 
			System.out.println("Out of range");
		
		
	}

}