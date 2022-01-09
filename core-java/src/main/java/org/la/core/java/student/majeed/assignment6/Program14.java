package org.la.core.java.student.majeed.assignment6;

public class Program14 {
	
	static int[] arr1 = new int[] {6,7,8,9,10,1,2,3,4,5}; 
	static int[] arr2 = new int[] {16,17,18,19,10,11,12,13,14,15};
	static int[] arr3 = new int[arr1.length+arr2.length];
	static int[] arr4 = new int[arr3.length];
	
	public static void main(String[] args) {		
		/*
		int[] copyArrays(int[], int[]) - target array size = size of arr1 + size of arr2
		copy first array and second array to two third array.
		 */
		
		arr4 = addTwoArrays(arr1,arr2);
		int i = 0;		
		for(int a1:arr4) {
			System.out.println("array["+i+"]: "+a1);
			i++;
		}
	}
	static int[] addTwoArrays(int[] a, int[] b) {
		int k=0;
		for(int j=0;j<a.length;j++) {
			arr3[j]=a[j];
			k++;
		}
		for(int m=0;m<b.length;m++) {
			arr3[k]=b[m];
			k++;
		}		
		return arr3; 
	}	

}