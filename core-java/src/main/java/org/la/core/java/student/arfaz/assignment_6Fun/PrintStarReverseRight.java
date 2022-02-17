package org.la.core.java.student.arfaz.assignment_6Fun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
	
	
void printStarReverseRight(int n)
		print star in decreasing order from right

*/

public class PrintStarReverseRight {
//	static Logger log = LoggerFactory.getLogger(PrintStarReverseRight.class);

	public static void main(String[] args) {
		int a=6;
		printStarReverse(a);
	}
	static  void printStarReverse(int a) {
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
