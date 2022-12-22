package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[] = new int[5];
         Scanner scanner = new Scanner(System.in);
         int sum = 0;
         for(int i=0;i<a.length;i++) {
        	 System.out.println("Enter a value : ");
        	 a[i] = scanner.nextInt();
        	 scanner.nextLine();
        	 sum += a[i];
         }
         System.out.println("Array is : "+ Arrays.toString(a));
         System.out.println("Sum of all the elements of the Array is : "+sum);
	}

}
