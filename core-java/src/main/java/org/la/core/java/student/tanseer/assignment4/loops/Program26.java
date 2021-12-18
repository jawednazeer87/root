package org.la.core.java.student.tanseer.assignment4.loops;

public class Program26 {

	public static void main(String[] args) {
		
		int i = 200;
		
		for(; i>=1 ; i--) {
			if(i % 13 == 0 && i % 2 == 0)
				System.out.println(i);
		}
	}

}
