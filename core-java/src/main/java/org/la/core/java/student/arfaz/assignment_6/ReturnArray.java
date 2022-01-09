package org.la.core.java.student.arfaz.assignment_6;

import org.la.core.java.jawed.array.Copy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
 * int[] copy(int[])
		create an array and copy supplied array and return that new array
	
*/

public class ReturnArray {
	static Logger log = LoggerFactory.getLogger(Copy.class);

	public static void main(String[] args) {
		int a[] = {-1,-2,-3,-4,5,6,7,8,9};
		int b[] = new int[a.length];
		int c[]= copyArray(a,b);
		for(int ar:c)
			log.info("Array= "+ar);
	}
	static  int[] copyArray(int[]a,int n[]) {
		
		for(int i=0;i<a.length;i++)  {
          n[i]= a[i];
						
		}
		return n;  	}
}
