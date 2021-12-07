package org.la.core.java.student.majeed.assignment3;

public class Program61 {

	public static void main(String[] args) {
		//61.	wap to print 'hello world' if number is divisible by 3 and 5, print 'hello' if divisible by 3 only, print 'world' if number is divisible by 5.
		int i = 10;
		if (i%3 == 0 && i%5 == 0) 
		System.out.println("hello world");	
		
		if (i%3 == 0 && i%5 != 0) 
			System.out.println("hello");
		
		if (i%3 != 0 && i%5 == 0) 
			System.out.println("world");
	}

}
