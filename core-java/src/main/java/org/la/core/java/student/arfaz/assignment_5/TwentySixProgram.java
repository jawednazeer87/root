package org.la.core.java.student.arfaz.assignment_5;

import java.util.Scanner;

// wap to remove duplicate elements from an array? 

public class TwentySixProgram {

	public static void main(String[] args) {

			int arr[]= {10, 20, 20, 10, 10, 20, 5, 20} , i=0,sum=0;
		Scanner s =new Scanner(System.in);
	int n= s.nextInt(),f=0;
		
		for( i=0;i<arr.length;i++) {
			
					if(n==arr[i])  {
						f=1;
						break;
				
					}
											
									
	  	  }
	
		
		if(f==1)
			System.out.println(n+"is found here");
		else
			System.out.println("not found");
         	
		
	}

}
