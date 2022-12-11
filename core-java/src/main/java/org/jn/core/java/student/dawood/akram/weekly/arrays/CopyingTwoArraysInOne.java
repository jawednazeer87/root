package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyingTwoArraysInOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] result = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++) {
        	System.out.println("Enter a value for arr1 at position-"+i);
        	arr1[i]= scanner.nextInt();
        	scanner.nextLine();
        }
        
        for(int j=0;j<arr2.length;j++) {
        	System.out.println("Enter a value for arr2 at position-"+j);
        	arr2[j]= scanner.nextInt();
        	scanner.nextLine();
        }
        
        for(int k=0;k<arr1.length;k++) {
        	result[k]= arr1[k];
        }
        
        for(int l=arr1.length, m=0;l<result.length;l++,m++) {
        	result[l]= arr2[m];
        }
      
        System.out.println(Arrays.toString(result));
        scanner.close();
	}

}
