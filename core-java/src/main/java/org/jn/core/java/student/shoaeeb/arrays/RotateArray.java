package org.jn.core.java.student.shoaeeb.arrays;

import java.util.Arrays;

public class RotateArray {

	static int [] rotateArray(int arr[])
	{	
		int m=arr.length;
		int newArr[] = new int[m];
		//int k=0;
		int temp=arr[m-1];
		for(int i=0; i<m-1; i++)
		{
			newArr[i+1]=arr[i];
		}
		newArr[0]=temp;
		return newArr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7};
		int k=0;
		while(k<3)
		{
			arr=rotateArray(arr);
			k++;
		}
		System.out.println(Arrays.toString(arr));
		
		rotateArray(arr);
		
	}

}
