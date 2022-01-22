package org.la.core.java.student.sajid.method.assignment6;

public class Wap29 {

	public static void main(String[] args) {
		// 29)	int countOnes(int a[])  a[] = {1,2,1,3,2,1,1,1};
		//count number of times one in array and return count
		
		int arr[] = {1,2,1,3,2,1,1,1};
		
		int count = countones(arr);
		System.out.println("Count of 1 in the array is: "+count);
	}
	
	static int countones(int[] a) {
		int ctr = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				ctr++;
			}			
		}
		return ctr;
	}

}
