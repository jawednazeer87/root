package org.la.core.java.student.sajid.looping.assignment4;

public class Wap78 {

	public static void main(String[] args) {
		// print pattern using loop
		
		char c = '*';
		int n = 4;
		
		for(int spc=n;spc>=1;spc--) {
			
		for(int i=n;i>spc;i--) {
			System.out.print(" ");
		}
			for(int j=1;j<=spc;j++) {
				System.out.print(c);
			}
			System.out.println("");

		}
	}

}


