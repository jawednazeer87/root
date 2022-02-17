package org.la.core.java.student.arfaz.assignment_6Fun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
	
	
	void printStarFromRight(int n)
		print star pattern from right
	

*/

public class PrintStarFromRight {
	static Logger log = LoggerFactory.getLogger(PrintStarFromRight.class);

	public static void main(String[] args) {
		int a=6;
		printStarFromRight(a);
	}
	static  void printStarFromRight(int a) {
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
