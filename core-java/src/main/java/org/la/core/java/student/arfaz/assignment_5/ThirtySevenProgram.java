	package org.la.core.java.student.arfaz.assignment_5;

import java.util.Scanner;

/*  find the common elements between two arrays?*/

public class ThirtySevenProgram {

	public static void main(String[] args) {

			int arr[]= {80,70,60,10,50,40,1,3,5};
			int odd[] = new int[8] ;
			int even[] = new int[8],count=0;
			
			
			for(int i=0,j=0;i<arr.length&&j<odd.length;i++,j++)  {
				if(arr[i]%2==0) {
					even[i]=arr[i];
				count++;
				}
				else if(arr[i]%2!=0)
					odd[j]=arr[count];

				
			}
				for(int e:even)
			System.out.print("e="+e+"  ");
	
			for(int o:odd)
			System.out.print("o= "+o+" ");         	
		
	}

}
