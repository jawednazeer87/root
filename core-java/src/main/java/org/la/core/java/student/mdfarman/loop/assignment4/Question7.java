package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question7 {

	public static void main(String[] args) {
//		7.	wap to print numbers which is completely divisible by 10 between 1 to 100.

		int start = 1 , end = 100 , div = 10 ;
		for ( ; start <= end; start++) {
			
			if(start%div==0)
				System.out.println(start);
		}
		
	}
}
