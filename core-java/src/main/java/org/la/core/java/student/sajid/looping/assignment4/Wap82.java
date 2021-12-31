package org.la.core.java.student.sajid.looping.assignment4;

public class Wap82 {

	public static void main(String[] args) {
		// Wap to print following pattern
		//1
		//1 2
		//1 2 3
		
		int limit = 3;
		
		for(int i=1;i<=limit;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		

	}

}
