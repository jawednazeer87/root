package org.la.core.java.student.arfaz.assignment_5;

import java.util.Scanner;

/* 
	28) wap to remove a specific element from an array?  */

public class TwentyEightProgram {

	public static void main(String[] args) {
		int arr[]= {0,80,70,60,10,50,0} ;
		
		
		int targetIndex = 0;
		for( int sourceIndex = 0;  sourceIndex < arr.length;  sourceIndex++ )
		{
		    if( arr[sourceIndex] != 0 )
		        arr[targetIndex++] = arr[sourceIndex];
		}
		for(int i=0;i<targetIndex;i++)
			System.out.print(arr[i]+" ");


     	
	
}

}
