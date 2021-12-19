package org.la.core.java.student.tanseer.assignment4.loops;

public class Program07 {

	public static void main(String[] args) {
		
		int n = 1 ;
		while(n <= 100) {
			if(n % 10 == 0)
				System.out.println(n);
			n++;
		}
		System.out.println();
		
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 10 == 0)
				System.out.println(i);
		}
	}

}
