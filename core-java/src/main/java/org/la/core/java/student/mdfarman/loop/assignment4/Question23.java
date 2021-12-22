package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question23 {

	public static void main(String[] args) {
//		23.	wap to print all numbers between 10 to 50 those are divisible by 5 and 9.

		
		int start = 10 , end = 50 , div1 = 3 , div2 = 9 ;
		for ( ; start <= end; start++) {
			
			if(start%div1==0 && start%div2==0)
				System.out.println(start);
		}
		
	}
}
