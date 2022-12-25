package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Scanner;

public class OnlyPositivesFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a = new int[5];
         Scanner scanner = new Scanner(System.in);
         
         for(int i=0;i<a.length;i++) {
        	 System.out.println("Enter a number");
        	 a[i] = scanner.nextInt();
        	 scanner.nextLine();
         }
         
         for(int j=0;j<a.length;j++) {
        	 if(a[j]>=0) {
        		 System.out.println(a[j]+" is a positive number.");
        	 }
         }
         scanner.close();
	}

}
