package org.la.core.java.student.waleed.homework.array.assignment5;

import java.util.Arrays;



public class Assign17Anotherway {

	public static void main(String[] args) {
		int a[] = {99,999,77,12,199};
		int b[] = {55,77,1,110,770};
		int c[] = new int[a.length + b.length];
		

		//*** you can also use the function arraycopy***
		
		System.out.println("\n"+" Print the resultant array ");
		
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
  
        // prints the resultant array
        System.out.println(Arrays.toString(c));
	}

}
