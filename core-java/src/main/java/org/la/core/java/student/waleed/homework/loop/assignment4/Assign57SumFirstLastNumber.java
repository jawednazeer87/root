package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign57SumFirstLastNumber {
	
	public static void main(String[] args) {
		   
       int n =9535;
       int sum= 0;
	   int firstNumber = 0, lastNumber = 0;
		lastNumber = n % 10;
		System.out.println("LastNumber = "+ lastNumber);
		for(; n>=10 ;) {
			
			firstNumber= n/10;
			n = n / 10;
			
		}
		
		System.out.println("FirstNumber = "+ firstNumber);
	    sum = sum + lastNumber + firstNumber;
	    System.out.println("Sum = "+ sum);
		//int p = (int) Math.pow(10, 2);
		//System.out.println("p = "+ p);
		
	}

}
