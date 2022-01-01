package org.la.core.java.student.sajid.looping.assignment4;

public class Wap79 {

	public static void main(String[] args) {
		// print pattern using loop
		
		int n = 4;
		char c = '*';
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
				for(int l=1;l<=i;l++) {
					System.out.print(c);
				}
				System.out.println("");
			}
			
		}

	}


