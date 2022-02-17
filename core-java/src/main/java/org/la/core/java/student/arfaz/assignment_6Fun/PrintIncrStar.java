package org.la.core.java.student.arfaz.assignment_6Fun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
	
	void printIncrStar(int n)
		print star patter
	

*/

public class PrintIncrStar {
	static Logger log = LoggerFactory.getLogger(PrintIncrStar.class);

	public static void main(String[] args) {
		int a=6;
		printIncrStar(a);
	}
	static  void printIncrStar(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");

			}
			System.out.println();
		}
		  
		  	
	}
	
}
