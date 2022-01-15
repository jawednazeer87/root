package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign08 {

	public static void main(String[] args) {
		
		int a [] = {20,50,70,90,100,1000,5000};
		
		int s=sumNum(a);
		System.out.println(" Sum = "+s);
		}
	
		static int sumNum(int a []) {
					int sum=0;
		for(int i=0 ; i<=a.length-1 ; i++) 
				sum+= a[i];
				
	           return sum;


	}


}
