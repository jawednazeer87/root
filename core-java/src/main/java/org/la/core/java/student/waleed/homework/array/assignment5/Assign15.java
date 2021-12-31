package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {44, -11 , -99, 50, -75 ,88,60,177,114,-444,125,199};
		int small = 50;
		for(int i=0; i<=a.length-1 ; i++) {
		  if( small >a [i]) {
			 small = a [i];
		  }
				
	      }
		System.out.println("Smallest number ="+small);
		
		
		
	}

}
