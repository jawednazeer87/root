package org.la.core.java.student.tanseer.assignment8.classes;

import java.util.Arrays;

public class ArrayOperationMain 
{
	public static void main(String[] args) 
	{
		ArrayOperation ar = new ArrayOperation();
		int[] arr = {10, -10, 20, -20, 30, -30};
		int[] arr2 = {10 , 20 , 30, 40, 50};
		
		System.out.println("Copy Array : ");
		ar.copyArray(arr);
		
		ar.reverseArray(arr);
		
		int[] c = ar.addTwoArrays(arr, arr2);
		System.out.println(Arrays.toString(c));
		
		ar.sumArray(arr2);
		
		ar.findMax(arr);
		
		ar.findMin(arr2);
		
		ar.countNegative(arr);
		
		ar.countPositive(arr);
	}
}
