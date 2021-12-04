package org.la.core.java.student.mdfarman.conditional.statement.assignment3;

public class Question46 {

	public static void main(String[] args) {

//		45. wap to find greatest number among two numbers
		
		int num1 = 1445 , num2 = 665 , num3 = 443;
		
		int check = (num1 > num2 && num1 > num3)? num1: (num2>num3)? num2:num3;
		
		System.out.println(check);
		        
	}

}
