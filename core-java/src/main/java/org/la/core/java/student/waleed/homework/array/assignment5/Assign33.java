package org.la.core.java.student.waleed.homework.array.assignment5;

import java.util.Arrays;

public class Assign33 {

	public static void main(String[] args) {
	
		//The easy way to find the second smallest number is 
				//1- sort of the array 
				//2- size/length  of the aray -7
				
				int a[] = {7,11,20,30,100,99,45,88};
				Arrays.sort(a);

			  System.out.println(" The second smallest number ="+a[a.length-7]);
			 
				
				
			  // Anther way to sove is as below
			  
			  
				int b[] = {11,40,507,300,440,90,1};
			  int temp;  
			
			  for (int i = 0; i <b.length; i++)   
			          {  
				  for (int j = i + 1; j < b.length; j++)   
			   	                  if (b[i] < b[j])   
			                  {  
			                      temp = b[i]; 
			                      b[i] = b[j];  
			                      b[j] = temp;  
			                  }  
			              }  
			  
			  System.out.println(" The second smallest number ="+b[b.length-2]);
			  
			  
			
			}
				
		
	}
