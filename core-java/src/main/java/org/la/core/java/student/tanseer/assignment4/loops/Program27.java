package org.la.core.java.student.tanseer.assignment4.loops;

public class Program27 {

	public static void main(String[] args) {
		
		int i = 1;
		
		for(; i<=1500 ; i++) {
			if(i % 11 == 0 && i % 13 == 0)
				System.out.println(i);
		}
	}

}
