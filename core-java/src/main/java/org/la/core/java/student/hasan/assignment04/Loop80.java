package org.la.core.java.student.hasan.assignment04;

public class Loop80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, row = 3;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=row-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
	}

}
