package org.jn.core.java.student.shoaeeb.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Program3 {
	//insert an element at postion
	
	static int[] insertAtPos(int arr[],int pos,int ele)
	{
		int newArray[]  = new int[arr.length+1];
		int i=0;
		while(i<pos-1)
		{
			newArray[i]=arr[i];
			i++;
		}
		newArray[pos-1]=ele;
		
		for(i=pos-1; i<arr.length; i++)
		{
			newArray[i+1]=arr[i];
		}
		
		return newArray;
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,1,5,4};
		int ele=6;
		int pos=1;
		int newArr[]=insertAtPos(arr,pos,ele);
		for(int e: newArr)
		{
			System.out.println(e);
		}
		
	}

}
