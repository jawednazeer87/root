package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
 * int sum(int[])
		find sum of all elements of an array and return sum
*/

public class ReturnSum {
	static Logger log = LoggerFactory.getLogger(ReturnSum.class);

	public static void main(String[] args) {
		int a[] = {5,6,7,8,9};
		int c= sumArray(a);
		log.info("Sum = "+c);
	}
	static  int sumArray(int[]a) {
		int s=0;
		for(int i=0;i<a.length;i++)  {
          s+= a[i];
						
		}
		return s;  	}
}
