package org.la.core.java.student.mdfarman.loop.assignment4;



public class Question26 {

	public static void main(String[] args) {
//		26.	wap to print all numbers between 200 to 1 those are divisible by 13 and 2.

		int start = 200 , end = 1 , div1 = 13 , div2 = 2 ;
		for ( ; start >= end; start--) {
			
			if(start%div1!=0 && start%div2!=0)
				System.out.println(start);
		}
		
	}
}
