package org.la.core.java.student.sjmohammed.assignment5;

/*
 * 
	47)	wap to count all 1's of an int array
		Suppose given array is [10, 19, 2, 7] -> number of 1's here zero
		Suppose given array is [1, 19, 1, 7, 1, 3] -> number of 1's here 3
 */
public class Example47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1, 19, 1, 7, 1, 3,1,6,1,53,15};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				count++;
			}
		}
		System.out.println("Number of 1's in an array is "+count);
	}

}
