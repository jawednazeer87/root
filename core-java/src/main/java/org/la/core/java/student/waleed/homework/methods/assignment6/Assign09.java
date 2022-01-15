package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign09 {

	public static void main(String[] args) {
      int a [] = {20,50,70,90,100,1000,5000};
		
		int av=averageNum(a);
		System.out.println(" Average = "+av);
		}
	
		static int averageNum(int a []) {
					int sum=0;
					
		for(int i=0 ; i<=a.length-1 ; i++) 
				sum+= a[i];
				
	           return sum/a.length;

	}

}
