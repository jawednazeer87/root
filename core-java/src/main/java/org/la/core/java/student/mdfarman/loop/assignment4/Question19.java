package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question19 {

	public static void main(String[] args) {
//		19.	wap to print all numbers between 30 to 80 those are divisible by 6 and 5.

		
		int start = 30 , end = 80 , div1 = 6 , div2 = 5 ;
		for ( ; start <= end; start++) {
			
			if(start%div1==0 && start%div2==0)
				System.out.println(start);
		}
		
	}
}
