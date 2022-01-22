package org.la.core.java.student.sajid.method.assignment6;

public class Wap30 {

	public static void main(String[] args) {
		// 30)	int countZero(int a[])  a[] = {1,0,1,0,0,1,1,0};
		//count number of zeros and return 
		
		int arr[] = {1,0,1,0,0,1,1,0};
		
		int count = countZero(arr);
		System.out.println("Count of 0 in the array is: "+count);
	}
	
	static int countZero(int[] a) {
		int ctr = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				ctr++;
			}			
		}
		return ctr;

	}

}
