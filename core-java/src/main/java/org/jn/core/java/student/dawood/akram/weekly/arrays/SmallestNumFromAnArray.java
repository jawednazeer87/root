package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Scanner;

public class SmallestNumFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array size :");
        int numOfElements = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[numOfElements];
        int smallest = arr[0];
        
        for(int i=0;i<arr.length;i++) {
        	System.out.println("Enter a value at position-"+i);
        	arr[i]= scanner.nextInt();
        	scanner.nextLine();
        }
        
        for(int j=0;j<arr.length;j++) {
        	if(smallest>arr[j]) {
        		smallest=arr[j];
        	}
        }
        System.out.println("Smallest element among the Array is : "+smallest);
        scanner.close();
	}

}
