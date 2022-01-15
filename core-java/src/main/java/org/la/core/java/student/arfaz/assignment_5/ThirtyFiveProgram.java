package org.la.core.java.student.arfaz.assignment_5;

import java.util.Arrays;
import java.util.Scanner;

/* wap to remove all zeros element from an array? */

public class ThirtyFiveProgram {

	public static void main(String[] args) {

			int arr[]= {0,-1,80,70,60,10,50,0,-1},j=0 ;
			
			
			for(int i=0;i<arr.length;i++)  {
			if(arr[i]>0) {
				arr[j] = arr[i];
				j++;
			}
		}
			for(int i=0;i<j;i++)
				System.out.print(arr[i]+" ");
	
	
         	
		
	}

}
