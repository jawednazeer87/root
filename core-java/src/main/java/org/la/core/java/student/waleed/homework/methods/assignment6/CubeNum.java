package org.la.core.java.student.waleed.homework.methods.assignment6;

import java.util.Scanner;

public class CubeNum {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a number :"); 
	double n= scan.nextDouble();
		System.out.println(cube(n)); 
	}
		public static long cube(double n) {
			return  (long) (n*n*n);
		}
		
		
		
	}


