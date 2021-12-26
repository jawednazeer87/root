package org.la.core.java.student.arfaz.assignment_5;

import java.util.Scanner;

/*  wap to find the index of an array element(here u have to take any number and check that number is 
present inside an array or not, 
if 	not print -1, if present then print its index means of that element)?*/

public class TwentyEightProgram {

	public static void main(String[] args) {

			int arr[]= {10, 20, 20, 10, 10, 20, 5, 20} , i=0;
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
