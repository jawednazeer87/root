package org.la.core.java.student.mdfarman.loop.assignment4;
public class Question66 {
	
//		66.	Wap to check whether a number is Prime number or not.

	
	public static void main(String[] args) {
		
		int num = 25;
		int looIter = num/2 + 1 ;
		int flag = 0;
	
		
		for (int i = 2 ; i <= looIter; i++) {
			if(num % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Prime Number");
		else 
			System.out.println("Not Prime Number");
		
	}
}
