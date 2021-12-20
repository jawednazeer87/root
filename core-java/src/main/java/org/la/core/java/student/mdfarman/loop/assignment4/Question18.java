package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question18 {

	public static void main(String[] args) {
//		18.	wap to print all numbers between 130 to 90 those are not divisible by 10.

		
		int start = 130 , end = 90 , div1 = 10 ;
		
		for ( ; start >= end; start--) {
			if(start%div1!=0)
				System.out.println(start);
		}
		
	}
}
