package org.la.core.java.student.sajid.looping.assignment4;

public class Wap55 {

	public static void main(String[] args) {
		int givenNum = 123456;
		int dispNum = givenNum;
		int count = 0;
		
		for(;givenNum>0;) {
						
			givenNum = givenNum/10;
			
			count++;		
			
		}
		System.out.println("Number of digits in "+dispNum+" are "+count);

	}

}
