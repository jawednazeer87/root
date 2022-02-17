package org.la.core.java.student.arfaz.assignment_5array;

import java.util.Scanner;

/*  find the common elements between two arrays?*/

public class ThirtyTwoProgram {

	public static void main(String[] args) {

			int arr[]= {80,70,60,10,50,40}, f=0,temp=0 ;
			
			
			for(int i=0;i<arr.length;i++)  {
				f=0;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						f=1;
						temp = arr[i];     // large var into temp so that it will transfer to next array
						arr[i] = arr[j];
						arr[j] = temp;  
					}
					if(f==0)
						break;
				}
			}
			System.out.println(arr[arr.length-2]);
//				for(int arr1 : arr )
//				System.out.println(arr1);
			
	
	
         	
		
	}

}
