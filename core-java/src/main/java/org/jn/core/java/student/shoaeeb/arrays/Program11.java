package org.jn.core.java.student.shoaeeb.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program11 {
	static int[] createTargetArr(int arr[],int index[])
	{
		int target[] = new int[arr.length];
		
		List<Integer>  list =new ArrayList<>();
		int i=0;
		for(int ele: arr)
		{
			list.add(index[i],ele);
			i++;
		}
		
		for(i=0; i<list.size(); i++)
		{
			target[i]=list.get(i);
		}
		return target;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,2,3,4};
		int index[] = {0,1,2,2,1};
		int newArr[]=createTargetArr(arr,index);
		System.out.println(Arrays.toString(newArr));
	}

}
