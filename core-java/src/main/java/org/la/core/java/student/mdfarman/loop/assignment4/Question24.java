package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question24 {

	public static void main(String[] args) {
//		24.	wap to print all numbers between 10 to 90 those are not divisible by 2 and 5.


		
		int start = 10 , end = 90 , div1 = 2 , div2 = 5 ;
		for ( ; start <= end; start++) {
			
			if(start%div1!=0 && start%div2!=0)
				System.out.println(start);
		}
		
	}
}
