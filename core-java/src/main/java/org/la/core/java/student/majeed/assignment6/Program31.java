package org.la.core.java.student.majeed.assignment6;

public class Program31 {

	public static void main(String[] args) {
		/*
		int countOnes(int a[])  a[] = {1,2,1,3,2,1,1,1};
		count number of times one in array and return count
		 */
		int[] arr1 = {1,2,1,3,2,1,1,1};
		int count = 0;
		count = countOnes(arr1);
		System.out.println(count);
	}
	
	static int countOnes(int[] a) {
		int countNumOnes=0;
	       for (int i = 0; i < a.length; i++) {
	    	   if(a[i]==1)
	    	   countNumOnes++;   
	        }
	       return countNumOnes;
		}
}