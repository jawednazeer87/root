package org.la.core.java.student.waleed.homework.array.assignment5;

import java.util.Arrays;

public class Assign38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The easy way to find the smallest number and largest  is 
				//1- sort of the array 
				//2- size/length  of the aray -n for smallest for largest length of  array -1
				
				int a[] = {7,11,20,30,100,99,45,88};
				Arrays.sort(a);
				  System.out.println(" The largest number ="+a[a.length-1]);
				 
				  System.out.println(" The smallest number ="+a[a.length-a.length]);
				  
				  System.out.println("---------------------------------------------------- ");
				  
				  //Anothe way to find them  as bellow
				  int big = 9;
				  int small = 20;
					for(int i=0 ; i<=a.length-1 ; i++) {
					if( big <a [i]) {
						  big = a [i];
					 }
						
					else if ( small > a [i]) {
							 small = a [i];
					  }
					    
				      }
					System.out.println("Greatest number ="+big);
			
					System.out.println("Smallest number =" +small);
		
		
	}

}
