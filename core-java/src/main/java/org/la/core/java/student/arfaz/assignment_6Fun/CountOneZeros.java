package org.la.core.java.student.arfaz.assignment_6Fun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
	
	
	
	int[] countOneZero(int a[]) - a[] = {1,0,1,0,0,1,1};
		create an array having the count of zero and one in given array, 
		return zero and one count array.
		e.g the return array having r[] = {3, 4}
		a[] = {1,0,1,0,0,1,1}; - this array having 3 zeros and 4 ones
*/

public class CountOneZeros {
//	static Logger log = LoggerFactory.getLogger(PrintStarReverseRight.class);

	public static void main(String[] args) {
		int a[] = {1,0,1,0,0,1,1};
		int b[] = countOneZero(a);
		for(int i:b)
			System.out.println(i);
	}
	static  int[] countOneZero(int a[]) {
		int on=0,z=0;
		int b[] = new int[2];
		for(int i=0;i<a.length;i++) {
			if(a[i]==0)
				on++;
			if(a[i]==1)
				z++;
				
		}
		b[0] = on;
		b[1]=z;
		return b;
		
		
	}
	
}
