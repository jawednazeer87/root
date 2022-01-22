package org.la.core.java.student.sajid.array;

public class Q52 {
	public static void main(String[] args) {
		/* 	52)	wap to add all elements of an array and check wether the sum is a prime number or not?
		Suppose given array is [10, 19, 2, 7] -> sum=38 is not a prime number
		Suppose given array is [10, 8, 2, 9] -> sum=29 is a prime number
		 */
		int[] arr1 = {10, 19, 2, 7};
		int sum =0;
		for(int m=0;m<arr1.length;m++) {
			sum += arr1[m];
		}	

			int i = 2;
			int j = sum;
			boolean k = true;
			while(i<=j) {			
				
				if(i!=j && j%i==0) {
					k = false;
					break;
				}
				i++;
			}
			
			if (k==true && j!=1) {
				System.out.println(sum+" is a Prime");
			} else
				System.out.println(sum+" is not a Prime");
	}

}
