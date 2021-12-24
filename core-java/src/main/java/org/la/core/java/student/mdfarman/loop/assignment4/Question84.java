package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question84 {

	//		84.	
	//				1
	//				1 2
	//				1 2 3


	public static void main(String[] args) {
		int i, j,number, n=3;   
		//loop for rows  
		for(i=0; i<n; i++)  
		{   
			number=1;   
			for(j=0; j<=i; j++)  
			{   
				System.out.print(number+ " ");   
				number++;   
			}   
			System.out.println();   
		}


	}  

}