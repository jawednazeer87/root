package org.la.core.java.student.majeed.assignment5;

public class Program51 {

	public static void main(String[] args) {
		/* 	51) wap to count all prime numbers of an array?
		Suppose given array is [100, 19, 2, 7, 50] -> 19, 2, 7 are prime numbers so the count = 3
		 */
		int[] arr1 = {100, 19, 2, 7, 50};
		int count = 0;
		for(int n=0; n<arr1.length;n++) {
			int i = 2;
			int j = arr1[n];
			boolean k = true;
			while(i<=j) {			
				
				if(i!=j && j%i==0) {
					k = false;
					break;
				}
				i++;
				
			}
			
			if (k==true && j!=1) 
				count++;
			
			}
		System.out.println(count);
	}
}
