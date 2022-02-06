package org.la.core.java.student.arfaz.assignment_9this;

public class DiamondPattern {
	private int a;
	public void seta(int a) {
		this.a=a;
	}
	public int geta() {
		return a;
	}
	
	
	public 	 void diamond() {
		for(int i=1;i<=a;i++) {
			for(int k=a;k>i;k--)  {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			System.out.print("* ");

			}
			
			System.out.println();
		}
		  
		  	for(int i=1;i<=a;i++) {
		  		
		  		for(int j=a;j>=i;j--)  {
		  			
		  				System.out.print("* ");
		  			
		  		}
		  		System.out.println();  // here it is used after printing * needs to print line
		  		for(int k=1;k<=i;k++)  {
		  			System.out.print(" ");
		  		}
		  		
		  	}
	}
			
}
