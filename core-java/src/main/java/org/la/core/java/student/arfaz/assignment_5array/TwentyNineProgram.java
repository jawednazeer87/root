package org.la.core.java.student.arfaz.assignment_5array;

import java.util.Scanner;

/*  wap to insert an element (specific position) into an array?*/

public class TwentyNineProgram {

	public static void main(String[] args) {

			int arr[]= {10, 20, 30,40,50,60,70,80} ;
		Scanner s =new Scanner(System.in);
	int i= s.nextInt();
	
					arr[i] = s.nextInt();					
		  
	for(int a:arr)  
		System.out.println(a);
	
         	
		
	}

}
