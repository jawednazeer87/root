package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Scanner;

public class AverageValueOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scanner = new Scanner(System.in);
         int[] a = new int[8];
         for(int i=0;i<a.length;i++) {
        	 System.out.println("Enter a value : ");
        	 a[i] = scanner.nextInt();
        	 scanner.nextLine();
         }
         int sum = 0;
         int average;
         for(int i=0;i<a.length;i++) {
        	 sum= sum+a[i];
         }
         System.out.println(sum);
         average = sum/a.length;
         System.out.println(average);
         scanner.close();
	}

}
