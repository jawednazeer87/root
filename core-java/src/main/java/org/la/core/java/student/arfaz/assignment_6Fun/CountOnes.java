package org.la.core.java.student.arfaz.assignment_6Fun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
	
	
int countOnes(int a[])  a[] = {1,2,1,3,2,1,1,1};
		count number of times one in array and return count
*/

public class CountOnes {
//	static Logger log = LoggerFactory.getLogger(PrintStarReverseRight.class);

	public static void main(String[] args) {
		int a[]= {1,2,1,3,2,1,1,1};
		countOnes(a);
	}
	static  void countOnes(int a[]) {
		int c=0;
		for(int i=0;i<a.length;i++)  {
			if(a[i]==1)
				c++;	
		}
		System.out.println(c);
	}
	
}
