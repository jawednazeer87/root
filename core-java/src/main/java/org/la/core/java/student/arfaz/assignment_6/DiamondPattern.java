package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
	
	
void diamond(int n)
		print diamond
*/

public class DiamondPattern {
//	static Logger log = LoggerFactory.getLogger(PrintStarReverseRight.class);

	public static void main(String[] args) {
		int a=4;
		diamond(a);
	}
	static  void diamond(int a) {
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
