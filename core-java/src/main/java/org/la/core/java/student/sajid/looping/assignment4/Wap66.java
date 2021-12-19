package org.la.core.java.student.sajid.looping.assignment4;

public class Wap66 {

	public static void main(String[] args) {
		int givenNum = 17;
		int rem = 0;
		boolean isPrime = true;
		
		if(givenNum==0||givenNum==1) {
			System.out.println("Given number "+givenNum+" is not a prime number");
		} else {
			for(int i=2;i<=givenNum/2;i++) {
				
				rem = givenNum%i;
				
				if (rem==0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println("Given number "+givenNum+" is a prime number");
			}else {
				System.out.println("Given number "+givenNum+" is not a prime number");
			}
		}

	}

}
