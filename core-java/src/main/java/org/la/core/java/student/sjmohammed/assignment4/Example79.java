package org.la.core.java.student.sjmohammed.assignment4;

public class Example79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=(n+4)-r;c++) {
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		n=4;
		for(int r=3;r<=n;r++) {
			for (int c=1;c<=r;c++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
