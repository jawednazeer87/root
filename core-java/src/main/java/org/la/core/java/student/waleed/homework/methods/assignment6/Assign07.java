package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign07 {

	public static void main(String[] args) {
		
		
		int a [] = {44, -11 , -99, 50, -75 ,88,60,177,114,-444,125,199};
		int b[]= copyReturn(a);
		int index = 0;
		for(int i:b) {
		  b[index]= i;
		  System.out.println("b ["+index+"] ="+b [index]);
			index++;}
	}
		 static int[] copyReturn(int a []) {
			
			
			int b[] = new int [a.length];
			for(int i=0 ; i<=a.length-1 ; i++) {
				
		        b[i]= a[i];
			      
      }
			
	return b;
			
			

	}

}
