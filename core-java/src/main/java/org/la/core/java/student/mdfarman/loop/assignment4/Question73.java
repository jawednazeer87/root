package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question73 {

	//		73.	Wap to check whether a number is Strong number or not

	public static void main(String[] args) {
		int num = 145;
		int sum = 0;
		int tempNum = num;
		
		
		
		while(tempNum!=0) {
			int rem = tempNum%10;
			int fact = 1;
			
			for(int i = 1 ; i<=rem; i++) {
				fact = fact  * i;
			}
			sum = sum+fact;
			tempNum /= 10;
		}
		if (num == sum)
			System.out.println("Strong");
		else
			System.out.println("Not Strong");

		  

	}
}