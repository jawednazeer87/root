package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Scanner;

public class NumNotDivisibleByGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();      
        for(int i=0;i<arr.length;i++) {
      	  System.out.println("Enter a value "+i);
      	  arr[i] = scanner.nextInt();
      	  scanner.nextLine();
        }
        
        for(int j=0;j<arr.length;j++) {
      	  if(arr[j]%num!=0) {
      		  System.out.println(arr[j]+" is not divisible by "+num);
      	  }
        }
        
        scanner.close();
	}

}
