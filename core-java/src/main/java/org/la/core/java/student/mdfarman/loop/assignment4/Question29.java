package org.la.core.java.student.mdfarman.loop.assignment4;



public class Question29 {

	public static void main(String[] args) {
//		29.	wap to print all numbers between 100 to 1 those are divisible by 11 and 3.

		int start = 100 , end = 1 , div1 = 11 , div2 = 3 ;
		for ( ; start >= end; start--) {
			
			if(start%div1==0 && start%div2==0)
				System.out.println(start);
		}
		
	}
}
