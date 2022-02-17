package org.la.core.java.student.arfaz.assignment_5array;

import java.util.Scanner;

/* wap to remove a specific element from an array?*/

public class TwentySevenProgram {

	public static void main(String[] args) {

			int arr[]= {10, 20, 30,40,50} , i=0;
		Scanner s =new Scanner(System.in);
	int n= s.nextInt(),f=0;
		
		for( i=0;i<arr.length;i++) {
			
					if(n==arr[i])  {
						f=1;
						break;
				
					}
											
									
	  	  }
	
		
		if(f==1)
			System.out.println(i+" index "+n+" has found");
		else
			System.out.println("not found");
         	
		
	}

}
