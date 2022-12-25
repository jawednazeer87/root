package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Scanner;

public class EvenNumsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] a = new int[5];
           Scanner scanner = new Scanner(System.in);
        
            for(int i=0;i<a.length;i++) {
            	System.out.println("Enter value-"+i);
            	a[i] = scanner.nextInt();
            	scanner.nextLine();
            }
            
            for(int j=0;j<a.length;j++) {
            	if(a[j]%2==0) {
            		System.out.println("a["+j+"] = "+a[j]+" is an even number.");
            	}
            }
            scanner.close();
	}

}
