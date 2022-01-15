package org.la.core.java.student.sajid.looping.assignment4;

public class Wap80 {

	public static void main(String[] args) {
		
		// print patter - Pyramid
		
		int limit = 4;
		
		for(int i=1;i<=limit;i++) {
			for (int j=1;j<=limit-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
					System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
