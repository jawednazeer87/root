package org.la.core.java.student.arfaz.assignment_6Fun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 
	
	
int countZero(int a[])  a[] = {1,0,1,0,0,1,1,0};
		count number of zeros and return 
*/

public class CountZeros {
//	static Logger log = LoggerFactory.getLogger(PrintStarReverseRight.class);

	public static void main(String[] args) {
		int a[]= {1,0,1,0,0,1,1,0};
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
