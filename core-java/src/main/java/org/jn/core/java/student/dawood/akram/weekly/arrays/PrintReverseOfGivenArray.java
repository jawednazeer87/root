package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintReverseOfGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int[] a = new int[5];
            Scanner scanner = new Scanner(System.in);
            
            for(int i=0;i<a.length;i++) {
            	System.out.println("Enter a number : ");
            	a[i] = scanner.nextInt();
            	scanner.nextLine();
            }
            System.out.println("Original Array :"+ Arrays.toString(a));
            System.out.print("Reverse Array");
            for(int j=a.length-1;j>=0;j--) {
            	System.out.print(" "+ a[j]); 	
            }   
            scanner.close();
	}

}
