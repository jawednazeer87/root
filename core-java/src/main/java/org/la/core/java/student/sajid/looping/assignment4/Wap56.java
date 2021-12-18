package org.la.core.java.student.sajid.looping.assignment4;

public class Wap56 {

	public static void main(String[] args) {
		int givenNum = 123456;
		int dispNum = givenNum;
		int firstDig = 0;
		int lastDig = 0;
		int rem = 0;
		
		rem = givenNum%10;
		
		lastDig = rem;
		
		for(;givenNum>0;) {
						
			rem = givenNum%10;
			
			givenNum = givenNum/10;					
			
		}
		firstDig = rem;
		System.out.println("first and last digits in "+dispNum+" are "+firstDig+" and "+lastDig);


	}

}
