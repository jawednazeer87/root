package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question22 {

	public static void main(String[] args) {
//		22.	wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.
		
		int start = 10 , end = 70 , div1 = 3 , div2 = 5 ;
		for ( ; start <= end; start++) {
			
			if(start%div1==0 && start%div2==0)
				System.out.println(start);
		}
		
	}
}
