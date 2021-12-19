package org.la.core.java.student.sajid.looping.assignment4;

public class Wap45 {

	public static void main(String[] args) {
		int givenNum = 123;
		int dispNum = givenNum;
		int sum = 0;
		
		for( ;givenNum>0;) {
			
			int r = givenNum % 10;
			
			givenNum = givenNum/10;
			
			sum =  sum+r; 
			System.out.println("Cuurent sum: "+sum);
				
		}
		System.out.println("Sum for digits in numer "+dispNum+" is: "+sum);

	}

}
