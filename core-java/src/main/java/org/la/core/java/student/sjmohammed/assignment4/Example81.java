package org.la.core.java.student.sjmohammed.assignment4;

public class Example81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int j=1;j<=n;j++){
			for(int spc=1;spc<j;spc++) {
				System.out.print(" ");
			}
			for(int y=1;y<n-j+1;y++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
