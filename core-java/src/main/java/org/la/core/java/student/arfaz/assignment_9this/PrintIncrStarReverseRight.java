package org.la.core.java.student.arfaz.assignment_9this;

public class PrintIncrStarReverseRight {
	private int a;

	public void seta(int a) {
		this.a=a;
	}
	public int geta() {
		return a;
	}
	
	
	public void printIncrStarRevRight() {
		
		
			for(int i=1;i<=a;i++) {
				for(int k=1;k<i;k++)  {
					System.out.print(" ");
				}
				for(int j=a;j>=i;j--) {
				System.out.print("*");

				}
				
				System.out.println();
			}
			  
			  	
		}
			
}
