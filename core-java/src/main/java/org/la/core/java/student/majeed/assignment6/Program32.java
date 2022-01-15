package org.la.core.java.student.majeed.assignment6;

public class Program32 {

	public static void main(String[] args) {
		/*
		int countZero(int a[])  a[] = {1,0,1,0,0,1,1,0};
		count number of zeros and return 
		 */
		int[] arr1 = {1,0,1,0,0,1,1,0};
		int count = 0;
		count = countZero(arr1);
		System.out.println(count);
	}
	
	static int countZero(int[] a) {
		int countNumZeros=0;
	       for (int i = 0; i < a.length; i++) {
	    	   if(a[i]==0)
	    		   countNumZeros++;   
	        }
	       return countNumZeros;
		}
	

}