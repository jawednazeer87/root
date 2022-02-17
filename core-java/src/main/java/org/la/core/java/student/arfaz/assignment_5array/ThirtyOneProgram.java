package org.la.core.java.student.arfaz.assignment_5array;

import java.util.Arrays;
import java.util.Scanner;

/*  wap to remove duplicate elements from an array?*/

public class ThirtyOneProgram {

	public static void main(String[] args) {

			int arr[]= {80,80,60,10,40,40}, j=0 ;
			
			Arrays.sort(arr);
			for(int i=0;i<arr.length-1;i++)   {
				if(arr[i]!=arr[i+1]) {
					arr[j] = arr[i];
					j++;
				}
					
			}
		arr[j]=arr[arr.length-1];
		for(int i=0;i<=j;i++)
			System.out.println(arr[i]);
	
	
         	
		
	}

}
