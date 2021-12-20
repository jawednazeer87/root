package org.la.core.java.student.mdfarman.loop.assignment4;
public class Question38 {
	
//	38.	wap to print all numbers from 1 to 10 except 2 and 5 and 8.
	
	public static void main(String[] args) {
		int start=1, end=10;
		for ( ; start <= end; start++) {
			if(start == 2 || start == 5 || start == 8 )
				System.out.print("");
			else
				System.out.println(start);
		}
	}
}
