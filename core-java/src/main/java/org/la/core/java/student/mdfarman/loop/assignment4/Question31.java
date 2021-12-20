package org.la.core.java.student.mdfarman.loop.assignment4;



public class Question31 {

	public static void main(String[] args) {
//		31.	wap to give a condition that loop may be rotate upto 10 but break loop when it rotates uptop 7 times.

		int start = 1 , end = 10 , breakat = 7 ;
		for ( ; start <= end; start++) {
			if(start==breakat)
				break;
			System.out.println(start);
		}
		
	}
}
