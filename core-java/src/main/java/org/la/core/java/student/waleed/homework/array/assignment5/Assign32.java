package org.la.core.java.student.waleed.homework.array.assignment5;

import java.util.Arrays;

public class Assign32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//The easy way to find the second highest number is 
		//1- sort of the array 
		//2- size/length  of the array -2
		
		int a[] = {7,11,555,7,100,99,45,201};
		Arrays.sort(a);

	  System.out.println(" The second highest number ="+a[a.length-2]);
	 
		
		
	  // Anther way to solve is as below
	  
	  
		int b[] = {11,40,507,300,440,90,1};
	  int temp;  
	
	  for (int i = 0; i <b.length; i++)   
	          {  
		  for (int j = i + 1; j < b.length; j++)   
	   	                  if (b[i] > b[j])   
	                  {  
	                      temp = b[i]; 
	                      b[i] = b[j];  
	                      b[j] = temp;  
	                  }  
	              }  
	  
	  
	  System.out.println(" The second highest number ="+b[b.length-2]);
	  
		
		
	}

}
