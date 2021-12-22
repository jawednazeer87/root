package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question17 {

	public static void main(String[] args) {
//		17.	wap to print all numbers between 30 to 50 those are not divisible by 7.

		
		int start = 30 , end = 50 , div1 = 7 ;
		
		for ( ; start <= end; start++) {
			if(start%div1!=0)
				System.out.println(start);
		}
		
	}
}
