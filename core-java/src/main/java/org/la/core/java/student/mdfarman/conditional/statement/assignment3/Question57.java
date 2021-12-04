package org.la.core.java.student.mdfarman.conditional.statement.assignment3;

public class Question57 {

	public static void main(String[] args) {

//		57. wap to print alphabet if the given character is 'alphabet' 
//		else print 'non alphabet'


		char ch =  '1';
		if ((ch >= 'A' && ch <= 'Z') || (ch >='a' && ch <= 'z'))
			System.out.println("alphabet");
		
		else 
			System.out.println("non alphabet");
		
		
	}

}