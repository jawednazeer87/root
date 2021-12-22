package org.la.core.java.student.mdfarman.loop.assignment4;
public class Question37 {
	
//	37.	wap to print all numbers from 1 to 10 except 3 and 7.	
	
	public static void main(String[] args) {
		int start=1, end=10;
		for ( ; start <= end; start++) {
			if(start == 3 || start == 7)
				System.out.print("");
			else
				System.out.println(start);
		}
	}
}
