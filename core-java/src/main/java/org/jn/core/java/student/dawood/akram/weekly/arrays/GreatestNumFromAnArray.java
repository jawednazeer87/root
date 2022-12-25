package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Scanner;

public class GreatestNumFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int elements = scanner.nextInt();
		scanner.nextLine();
		int[] arr = new int[elements];
		int greatest= arr[0];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter a value for position-"+i);
			arr[i] = scanner.nextInt();
			scanner.nextLine();
		}
		for(int i=0;i<arr.length;i++) {
			if(greatest<=arr[i]) {
				greatest = arr[i];
			}
		}
      System.out.println("Greatest number in the given Array is:"+ greatest);
      scanner.close();
	}
}
