package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr1 = new int[3];
         int[] arr2 = new int[2];
         int[] result = new int[(int) Math.max(arr1.length, arr2.length)];
         
         Scanner scanner = new Scanner(System.in);
         
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
         
         for(int k=0;k<result.length;k++) {
        	 if(arr1.length>k) {
        		 result[k] = result[k] + arr1[k];
        	 }
        	 if(arr2.length>k) {
        		 result[k] = result[k] + arr2[k];
        	 }
         }
         System.out.println(Arrays.toString(result));
         scanner.close();
	}

}
