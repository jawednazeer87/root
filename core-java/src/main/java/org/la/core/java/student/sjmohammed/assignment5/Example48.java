package org.la.core.java.student.sjmohammed.assignment5;

/*
 * 48)	wap to count all 2's of an int array
		Suppose given array is [10, 19, 2, 7] -> number of 2's here one
		Suppose given array is [1, 19, 1, 7, 1, 3] -> number of 2's here 0
 */
public class Example48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1, 2, 1, 7, 1, 3,1,6,1,53,15};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==2) {
				count++;
			}
		}
		System.out.println("Number of 2's in an array is "+count);
	}

}
