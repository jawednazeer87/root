package org.la.core.java.student.tanseer.assignment4.loops;

public class Program21 {

	public static void main(String[] args) {
		int n = 10;
		
		while(n <= 50) {
			if( n % 2 == 0 && n % 5 == 0)
				System.out.println(n);
			n++;
		}
	}

}
