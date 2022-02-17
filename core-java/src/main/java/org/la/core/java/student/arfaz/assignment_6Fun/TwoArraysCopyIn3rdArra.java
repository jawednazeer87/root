package org.la.core.java.student.arfaz.assignment_6Fun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
 * int[] addTwoArrays(int[], int[]) - all array of same size
		add two supplied arrays elements and then copy the sum of each element to 3rd array and 
		return 3rd array.

*/

public class TwoArraysCopyIn3rdArra {
	static Logger log = LoggerFactory.getLogger(TwoArraysCopyIn3rdArra.class);

	public static void main(String[] args) {
		int a[] = {19,-2,-1,5,6,7,8,9};
		int b[] = {19,-2,-1,5,6,7,8,9};
	 int c[]= addTwoArrays(a,b);
	 for(int ar:c)
		log.info("addTwoArrays = "+ar);
	}
	static  int[] addTwoArrays(int[]a,int n[]) {
		int []res = new int[a.length];
		for(int i=0;i<a.length;i++)  {
          res[i]= a[i]+n[i];	
		}
		return res;  	
		}
	
}
