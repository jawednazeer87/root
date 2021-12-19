package org.la.core.java.student.sajid.looping.assignment4;

public class Wap71 {

	public static void main(String[] args) {
		int givenNum = 496;
		int sum=0;
		
		for(int i=1;i<=givenNum/2;i++) {
			System.out.println("value of i: "+i);
			
			if(givenNum%i == 0){
			
			sum=sum+i;
			System.out.println("Value of sum: "+sum);
			}
		}
		
		if (sum==givenNum) {
			System.out.println("Given Number "+givenNum+" is a perfect number");
		}else {
			System.out.println("Given Number "+givenNum+" is not a perfect number");
		}

	}

}
