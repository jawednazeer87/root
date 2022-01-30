package org.la.core.java.student.arfaz.assignment_8class;

public class PrintIncrStar {
	private int a;

	public void seta(int fir) {
		a=fir;
	}
	public int geta() {
		return a;
	}
	
	
	public void printIncrStar() {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");

			}
			System.out.println();
		}
		  
		  	
	}
}
