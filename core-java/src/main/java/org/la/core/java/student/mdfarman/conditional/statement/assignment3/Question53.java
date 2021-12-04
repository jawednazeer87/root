package org.la.core.java.student.mdfarman.conditional.statement.assignment3;

public class Question53 {

	public static void main(String[] args) {

//		53. wap to check whether a given number is positive and double digit
//		or single digit number 
		
		int num = 25;
		
		if (num > 9 && num < 100  )
		{
			System.out.println("Double digit number ");
		}
		else if (num >= 0 && num < 10    )
		{
			System.out.println("Single digit number ");
		}
		else
			System.out.println("Out of range");
		
		
	}

}
