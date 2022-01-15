package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign10 {

	public static void main(String[] args) {
		
		int a [] = {44, -11 , -99, 50, -75 ,88,60,177,114,-444,125,11000};
		
		int big =  greatestNumb(a);
		
		System.out.println("Greatest number = "+big);
	}
		 static int greatestNumb(int a []){
			int big= 99;
		for(int i:a) {
		  if( big <i) {
			  big = i;
		  }
				
	      }
		return big;
		
		

	}

}
