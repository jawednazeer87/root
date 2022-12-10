package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyReverseOfArrayInAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = new int[5];
         int[] b = new int[5];
         
         Scanner scanner = new Scanner(System.in);
         
         for(int i=0;i<a.length;i++) {
        	 System.out.println("Enter a value : ");
        	 a[i] = scanner.nextInt();
        	 scanner.nextLine();
         }
         
         for(int j=0;j<a.length;j++) {
        	  b[j] = a[a.length-j-1];
         }
         System.out.println(Arrays.toString(a));
         System.out.println(Arrays.toString(b));
	}

}
