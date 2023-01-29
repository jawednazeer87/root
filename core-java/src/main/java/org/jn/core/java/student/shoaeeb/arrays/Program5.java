package org.jn.core.java.student.shoaeeb.arrays;

import java.util.HashSet;
import java.util.Set;

public class Program5 {
	//remove duplicate elements from array
	static void removeDuplicateArr(int arr[])
	{
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<arr.length; i++)
		{
			set.add(arr[i]);
		}
		
		System.out.println(set);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,2,1,6,7,6};
		removeDuplicateArr(arr);
	}

}
