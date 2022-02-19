package org.la.core.java.student.waleed.homework.classwr.model;

/**
 * @author Waleed Rizq
 *
 * @date Feb 13, 2022
 */
public class ChildOdd extends ParentOdd {
	@Override
	public int addOddEelements(int[] a) {
		
		
		int sum=0;
		for(int i=0 ; i<=a.length-1 ; i++) {
			if(a [i] %2==1) {
				sum+=a[i];
				
	           }
		}
		return sum;
		
		}

}
