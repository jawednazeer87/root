package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Scanner;

public class AllPrimesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int temp;
        for(int i=0;i<a.length;i++) {
        	System.out.println("Enter a number for 'a' at position-"+i);
        	a[i] = scanner.nextInt();
        	scanner.nextLine();
        }
        for(int i=0;i<a.length;i++) {	
        	temp=0;
        	for(int j=2;j<=a[i]-1;j++) {
        		if(a[i]%j==0) {
        			temp = temp+1;
        		}
        	}
        	if(a[i]>1 && temp==0) {
        		System.out.println("a["+i+"] = "+a[i] +" is a prime");
        	}
        }
        
        scanner.close();
	}

}
