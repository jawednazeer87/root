package org.la.core.java.student.sajid.looping.assignment4;

public class Wap64 {

	public static void main(String[] args) {
		int givenNum = 3;
		int dispNum = givenNum;
		int power = 3;
		int res=1;
		
		for(int i=1;i<=power;i++) {
			
			res = res * givenNum;
		}
		
		System.out.println(givenNum+" to the power of "+power+" is "+res);

	}

}
