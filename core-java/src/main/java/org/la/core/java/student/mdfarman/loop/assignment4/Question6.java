package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question6 {

	public static void main(String[] args) {
//		6.	wap to print numbers which is completely divisible by 3 between 1 to 10.

		int start = 1 , end = 10 , div = 3 ;
		for ( ; start <= end; start++) {
			
			if(start%div==0)
				System.out.println(start);
		}
		
	}
}
