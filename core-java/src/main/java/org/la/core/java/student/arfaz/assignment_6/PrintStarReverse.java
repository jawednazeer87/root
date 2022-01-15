package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
	
	
void printStarReverse(int n)
		print star pattern in decrease order 

*/

public class PrintStarReverse {
	static Logger log = LoggerFactory.getLogger(PrintStarReverse.class);

	public static void main(String[] args) {
		int a=6;
		printStarReverse(a);
	}
	static  void printStarReverse(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=a;j>=i;j--) {
			System.out.print("*");

			}
			
			System.out.println();
		}
		  
		  	
	}
	
}
