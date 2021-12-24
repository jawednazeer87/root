package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a [] = {44, -11 , -99, 50, -75 ,88,60,177,114,-444,125,199};
		int b [] = new int [a.length];
		int j = a.length;
		for(int i=0 ; i<=a.length-1 ; i++) {
		        b[j-1]=a [i];
		              j= j-1;
		             
		              }
		
		for(int i=0 ; i<=b.length-1 ; i++) {

			System.out.println("b ["+i+"] ="+b [i]);
	}
		 
}
}
