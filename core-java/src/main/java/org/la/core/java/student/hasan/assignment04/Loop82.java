package org.la.core.java.student.hasan.assignment04;

public class Loop82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,number, n=3;   
		//loop for rows  
		for(i=0; i<n; i++)  
		{   
		number=1;   
		//loop for columns  
		for(j=0; j<=i; j++)  
		{   
		//prints num  
		System.out.print(number+ " ");   
		//incrementing the value of number   
		number++;   
		}   
		//throws the cursor at the next line after printing each row  
		System.out.println();   
		} 
	}

}
