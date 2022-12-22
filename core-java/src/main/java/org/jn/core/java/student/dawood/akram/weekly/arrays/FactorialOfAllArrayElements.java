package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Scanner;

public class FactorialOfAllArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int fact=1;
        int[] a = new int[6];
        for(int i=0;i<a.length;i++) {
           System.out.println("Enter value-"+i);
           a[i] = scanner.nextInt();
           scanner.nextLine();
        }
        
        for(int j=0;j<a.length;j++) {
        	fact = 1;
        	for(int k=a[j];k>=1;k--) {
        		fact = fact*k;
        	}
        	
        	System.out.println("Factorial of a["+j+"] = "+a[j]+" is : "+fact);
        }
        scanner.close();
	}

}
