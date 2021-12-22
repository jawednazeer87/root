package org.la.core.java.student.mdfarman.loop.assignment4;



public class Question28 {

	public static void main(String[] args) {
//		28.	wap to print all numbers between 10 to 300 those are divisible by 11 and 12.

		int start = 10 , end = 300 , div1 = 11 , div2 = 12 ;
		for ( ; start <= end; start++) {
			
			if(start%div1==0 && start%div2==0)
				System.out.println(start);
		}
		
	}
}
