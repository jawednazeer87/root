package org.la.core.java.student.arfaz.assignment_8class;

public class PrintIncrStarFromRight {
	private int a;

	public void seta(int fir) {
		a=fir;
	}
	public int geta() {
		return a;
	}
	
	
	public void printStarFromRight() {
		for(int i=1;i<=a;i++) {
			for(int j=a;j>i;j--) {
			System.out.print(" ");

			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		  
		  	
	}
}
