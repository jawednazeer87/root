package org.la.core.java.student.tanseer.assignment4.loops;

public class Program28 {

	public static void main(String[] args) {
		
		int i = 10;
		
		for(; i<= 300 ; i++) {
			if(i % 11 == 0 && i % 12 == 0)
				System.out.println(i);
		}
	}

}
