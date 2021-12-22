package org.la.core.java.student.mdfarman.loop.assignment4;



public class Question30 {

	public static void main(String[] args) {
//		30.	wap to print all numbers between 1 to 150 multiple of 11.

		int start = 1 , end = 150 , mult = 11 ;
		for ( ; start <= end; start++) {
			if(start%mult==0)
				System.out.println(start);
		}
		
	}
}
