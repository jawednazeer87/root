package org.la.core.java.student.tanseer.assignment4.loops;

public class Program19 {

	public static void main(String[] args) {
		int n = 80;
		
		for(int i = 30 ; i <= n ; i++) {
			if(i % 6 == 0 && i % 5 == 0)
				System.out.println(i);
		}
	}

}
