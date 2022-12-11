package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Scanner;

public class CheckTwoArraysAreEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] arr1 = new int[5];
           int[] arr2 = new int[5];
           int count=0;
           Scanner scanner = new Scanner(System.in);
           for(int i=0;i<arr1.length;i++) {
        	   System.out.println("Enter a number for arr1 :");
        	  arr1[i] = scanner.nextInt();
        	  scanner.nextLine();
           }
           for(int j=0;j<arr2.length;j++) {
        	   System.out.println("Enter a number for arr2 :");
        	   arr2[j] =  scanner.nextInt();
        	   scanner.nextLine();
           }
           
           for(int k=0;k<arr1.length;k++) {
        	   if(arr1[k]==arr2[k] && arr1.length==arr2.length) {
        		   count++;
        	   }
           }
           if(arr1.length==count) {
        	   System.out.println("Both the arrays are equal");
           } else {
        	   System.out.println("Both the arrays are not equal");
           }
	}

}
