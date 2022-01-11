package org.la.core.java.student.majeed.assignment6;

public class Program34 {

	public static void main(String[] args) {
		/*
		int[] countOneZero(int a[]) - a[] = {1,0,1,0,0,1,1};
		create an array having the count of zero and one in given array, 
		return zero and one count array.
		e.g the return array having r[] = {3, 4}
		a[] = {1,0,1,0,0,1,1}; - this array having 3 zeros and 4 ones
		 */
		int[] arr1 = {1,0,1,0,0,1,1};
		int[] arr2 = countOneZero(arr1);
		for(int a2:arr2) {
			System.out.println(a2);
		}
	}
	
	static int[] countOneZero(int[] a) {
		int[] result = new int[2];
		int countZero = 0, countOne = 0, i = 0;
	    	for(int a1:a) {
	    		if(a1==1) {
	    			countOne++;
	    		}else if(a1==0) {
	    			countZero++;
	    		}
	    		i++;
	    	}
	    	result[0] = countZero;
	    	result[1] = countOne;
	       return result;
		}
}