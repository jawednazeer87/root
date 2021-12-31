	package org.la.core.java.student.arfaz.assignment_5;

import java.util.Scanner;

/*  find the common elements between two arrays?*/

public class ThirtySevenProgram {

	public static void main(String[] args) {

			int arr[]= {80,70,60,10,50,40,1,3,5,7};
			int odd[] = new int[6] ;
			int even[] = new int[6],j=0;
			
			
			for(int i=0;i<arr.length;i++)  {
				if(arr[i]%2==0) {
					even[i]=arr[i];
				
				}
				else if(arr[i]%2!=0) {
					odd[j]=arr[i];
				         j++;  // here you need to increment because you have to store the next value in next variable like a[1] to a[2]
				}
				
			}
				for(int e:even)
			System.out.println("e="+e+"  ");
	
			for(int o:odd)
			System.out.println("o= "+o+" ");         	
		
	}

}
