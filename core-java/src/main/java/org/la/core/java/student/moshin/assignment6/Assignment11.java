package org.la.core.java.student.moshin.assignment6;

public class Assignment11 {
	
		public static void main(String[] args) {
			
		      int a [] = {-44000, -11 , -99, 50, -75 ,88,60,177,114,-444,125,11000};
				
				int small =  smallestNumb(a);
				
				System.out.println("Smallest number = "+small);
			}
				 private static int smallestNumb(int[] a) {
						int small= 99;
						for(int i:a) 
						  if(small >i) {
							  small = i;
						 	                  
							       }
					
						return small;

		          }
				 
		 }
