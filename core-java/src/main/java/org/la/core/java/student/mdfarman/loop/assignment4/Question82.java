package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question82 {

	//		81.
	//			1
	//			1 2
	//			1 2 3

	public static void main(String[] args) {
		 int n=3;   
		for(int i=0; i<n; i++)  
		{   
			int number = 1;
			for(int j=0; j<=i; j++)  
			{   
				System.out.print(number+ " ");   
				number++;   
			}   
			System.out.println();   
		}   

	}  

}