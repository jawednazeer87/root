package org.la.core.java.student.mdfarman.conditional.statement.assignment3;

public class Question61 {

	public static void main(String[] args) {

//		61.	wap to print 'hello world' if number is divisible by 3 and 5, 
//		print 'hello' if divisible by 3 only, print 'world' 
//		if number is divisible by 5.

		int num = 26;
		if (num%3==0 && num%5==0)
			System.out.println("hello world");
		else if(num % 3 == 0)
			System.out.println("hello");
		else if ( num % 5 == 0)
			System.out.println("world");
		else
			System.out.println("out of range");


		


	}

}