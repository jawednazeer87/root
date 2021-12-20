package org.la.core.java.student.mdfarman.loop.assignment4;



public class Question27 {

	public static void main(String[] args) {
//		27.	wap to print all numbers between 1 to 1500 those are divisible by 11 and 13.

		int start = 1 , end = 1500 , div1 = 11 , div2 = 13 ;
		for ( ; start <= end; start++) {
			
			if(start%div1==0 && start%div2==0)
				System.out.println(start);
		}
		
	}
}
