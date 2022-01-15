package org.la.core.java.student.arfaz.assignment_5;

import java.util.Arrays;
import java.util.Scanner;

/* wap to remove all zeros element from an array? */

public class ThirtyFourProgram {

	public static void main(String[] args) {

			int arr[]= {0,80,70,60,10,50} ;
			
			
			for(int i=0;i<arr.length;i++)  {
				if(arr[i]==0) {
					for(int j=i;j<arr.length-1;j++) {
						arr[j] = arr[j+1];
					}
					break;

				}
			}
			for(int i=0;i<arr.length-1;i++)
				System.out.print(arr[i]+" ");
	
	
         	
		
	}

}
