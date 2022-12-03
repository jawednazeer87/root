package org.jn.core.java.student.azhan.array;

public class Problem18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,3,5,7,9};
		int arr2[] = {2,4,6,8,10};
		int arr3[] = new int[arr1.length + arr2.length];
		int i;
		for(i=0; i<arr1.length; i++)
			arr3[i] = arr1[i];
		for(int j=i,k=0; k<arr2.length; j++,k++)
			arr3[j] = arr2[k];
		for(i=0; i<arr3.length; i++)
			System.out.print(arr3[i]+", ");
	}

}
