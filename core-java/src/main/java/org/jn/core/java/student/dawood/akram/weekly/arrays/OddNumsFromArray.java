package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Scanner;

public class OddNumsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++) {
        	System.out.println("Enter value-"+i);
        	arr[i] = scanner.nextInt();
        	 scanner.nextLine();
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2!=0) {
            	System.out.println("arr[" + j + "] = " + arr[j] + " is an odd number.");
            }
        scanner.close();
	}

	}
}
