package org.la.core.java.student.waleed.homework.array.assignment5;

import java.util.Arrays;

public class Assign24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {7,11,99,7,100,99,45,107};
		Arrays.sort(a);
        int index =0;
        // Traverse an array
	  for(int i = 0; i < a.length-1; i++)
      {
            if(a[i] != a[i+1]) {
            	System.out.println( " index ="+ index+"-----"+"a["+i+"]"+" = "+ a[i]); // just to check the new value to array a after changing the index value
            a[index++] = a[i];
        
        }
      }
	    System.out.println("index =" + index); // just to check the index 
	  a[index++] = a[a.length-1]; // to add the last element in array a
	  System.out.println("index =" + index); // index = 6
	// Changing original array
      for(int i = 0; i <index; i++) 
      	
        System.out.print( a[i]+" ");
		
	}

		
		
	}


