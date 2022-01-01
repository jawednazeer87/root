package org.la.core.java.student.sajid.looping.assignment4;

public class Wap81 {

	public static void main(String[] args) {
		// Print pattern - reverse pyramid
		
		int limit = 5;
		
		for(int i=1;i<=limit;i++) {
			for(int k=1;k<i;k++){
					System.out.print(" ");
			}
			for (int j=1;j<=limit-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
