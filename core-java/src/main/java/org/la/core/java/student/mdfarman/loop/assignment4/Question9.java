package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question9 {

	public static void main(String[] args) {
//			9.	wap to print numbers which is multiple of 3 between 1 to 22.

		
		int start = 1 , end = 22 , div1 = 3 ;
		
		for ( ; start <= end; start++) {
			if(start%div1==0)
				System.out.println(start);
		}
		
	}
}
