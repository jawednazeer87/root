package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question8 {

	public static void main(String[] args) {
//		8.	wap to print numbers which is completely divisible by 3 and 2 between 1 to 10.
		
		int start = 1 , end = 10 , div1 = 3 , div2 = 2 ;
		for ( ; start <= end; start++) {
			
			if(start%div1==0 && start%div2==0)
				System.out.println(start);
		}
		
	}
}
