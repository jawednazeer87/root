package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question16 {

	public static void main(String[] args) {
//		16.	wap to print all odd numbers between 120 to 100.

		
		int start = 120, end = 100;
		for (;start>=end;start--) {
			if (start%2!=0)
				System.out.println(start);
		}
		
		
	}
}
