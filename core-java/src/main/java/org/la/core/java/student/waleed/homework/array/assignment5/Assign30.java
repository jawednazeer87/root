package org.la.core.java.student.waleed.homework.array.assignment5;

import java.util.Arrays;

public class Assign30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a [] = {33,99,7,150,200};
		int b [] = {7,100,800,150,99};
		Arrays.sort(a);
		Arrays.sort(b);
		if(a.length == b.length){
        for (int i = 0; i <=a.length-1; i++) {
      
                if (a[i]==b[i])  {
                	System.out.println("The common elements between array a & b : " + a[i]);
                              }
                
                  }
		}
		
        else {
        	 System.out.println(" There are no such common elements btween the 2 arrays");
	}



		
	}

}
