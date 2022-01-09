package org.la.core.java.student.arfaz.assignment_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
 * int[] copyArrays(int[], int[]) - target array size = size of arr1 + size of arr2
		copy first array and second array to two third array.

*/

public class AddingArrays {
	static Logger log = LoggerFactory.getLogger(AddingArrays.class);

	public static void main(String[] args) {
		int a[] = {19,-2,-1,5,6,7,8,9};
		int b[] = {19,-2,-1,5,6,7,8,9};
	 int c[]= copyArrays(a,b);
	 for(int ar:c)
		log.info("CopyArrays = "+ar);
	}
	static  int[] copyArrays(int[]a,int n[]) {
		int total = a.length+n.length;
		int []res = new int[total];
		int j=0,l=0;
		for(int i=0;i<a.length;i++)  {
	     res[j]=a[i] ;
          j++;
		}
		for(int i=j;i<total;i++)  {
			res[i] = n[l];
			l++;
		}
			
		return res;  	
		}
	
}
