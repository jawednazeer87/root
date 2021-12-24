package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a [] = {125, 133 ,99,125,230,111};
		int b [] = {55,77,1,110,770};
		int size = a.length<b.length? a.length: b.length;
		int c [] = new int[size];
		for(int i=0 ; i<=size-1 ; i++) {
		       c[i]= a [i] + b [i];
		         
		              } 
		for(int i=0 ; i<=c.length-1 ; i++) {

			System.out.println("c ["+i+"] = "+ c [i]);
	          }
		
		
	}

}
