package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign56PrintFirstLastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =783159;
		
		int firstNumber = 0, lastNumber = 0;
		lastNumber = n % 10;
		System.out.println("LastNumber = "+ lastNumber);
		for(; n>=10 ;) {
			
			firstNumber= n/10;
			n = n / 10;
			
		}
		
		System.out.println("FirstNumber = "+ firstNumber);
		
	
		
	}

}
