package org.jn.core.java.student.dawood.akram.weekly.arrays;

import java.util.Scanner;

public class PrintArrayWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
             Scanner scanner = new Scanner(System.in);
                 for(int i=0;i<a.length;i++) {
                	 System.out.println("Enter value - "+i);
                	 a[i] = scanner.nextInt();
                 }
                 
                 for(int i=0;i<a.length;i++) {
                	 System.out.println("a["+i+"] = "+a[i]);
                 }
                 scanner.close();
	}

}
