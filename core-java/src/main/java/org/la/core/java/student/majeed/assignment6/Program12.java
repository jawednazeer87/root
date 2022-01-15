package org.la.core.java.student.majeed.assignment6;

public class Program12 {
	
	static int[] arr1 = new int[] {6,7,8,9,10,1,2,3,4,5}; 
	static int[] arr2 = new int[] {16,17,18,19,10,11,12,13,14,15};
	static int[] arr3 = new int[arr1.length];
	static int[] arr4 = new int[arr1.length];
	
	public static void main(String[] args) {		
		/*
		int[] addTwoArrays(int[], int[]) - all array of same size
		add two supplied arrays elements and then copy the some of each element to 3rd array and 
		return 3rd array.
		 */
		
		arr4 = addTwoArrays(arr1,arr2);
		int i = 0;		
		for(int a1:arr4) {
			System.out.println("array["+i+"]: "+a1);
			i++;
		}
		
	}
	static int[] addTwoArrays(int[] a, int[] b) {
		for(int j=0;j<a.length;j++) {
			arr3[j]=a[j]+b[j];			
		}
		return arr3; 
	}	

}