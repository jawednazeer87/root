package org.la.core.java.student.tanseer.assignment4.loops;

public class Program04 {

	public static void main(String[] args) {
		
		int i = 0;
		int n = 5;
		
		
		while(i<=2*n) {
			if(i % 2 == 0)
			System.out.println(i);
			i++;
		}
	
		System.out.println();
		
		for(int j = 1 ; j <= 2*n ; j++) {
			if(j % 2 == 0) {
				System.out.println(j);
			}
		}
		
	}

}
