package org.la.core.java.student.sajid.looping.assignment4;

public class Wap60 {

	public static void main(String[] args) {
		int givenNum = 1234;
		int sum=1;
		int rem;
		
		System.out.println("Given Num: "+givenNum);
		
		while(givenNum > 0) {
			rem = givenNum % 10;
			givenNum = givenNum/10;
			sum = sum * rem;
		}
		System.out.println("Product of digits of given Num: "+sum);

	}

}
