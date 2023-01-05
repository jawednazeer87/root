package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class CopyTwoArray {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6}; //length =6
		int[] arr2 = {7,8,9,10,11}; //length = 5
		
		int[] arr3 = copyArray(arr1, arr2);
		for(int x:arr3) {
			System.out.println(x);
		}
	}
	
	static int[] copyArray(int[] arr1, int[] arr2) {
		int arraySize = arr1.length + arr2.length; //6+5=11
		int[] newArray = new int[arraySize];
		
		for(int i=0; i<arr1.length;i++) {
			newArray[i] = arr1[i];//0=0,1=1,,,,5
		}
		for(int i=arr1.length;i<arraySize;i++) {
			newArray[i] = arr2[i - arr1.length]; //6=(6-6),7=(7-6)
		}
		return newArray;
	}

}
