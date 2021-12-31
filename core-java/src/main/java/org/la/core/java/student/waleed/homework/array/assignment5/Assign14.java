package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {44, -11 , -99, 50, -75 ,88,60,177,114,-444,125,199};
		int big = 9;
		for(int i=0 ; i<=a.length-1 ; i++) {
		  if( big <a [i]) {
			  big = a [i];
		  }
				
	      }
		System.out.println("Greatest number ="+big);
		
		
	}

}
