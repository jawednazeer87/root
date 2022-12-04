package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment4;

import java.util.Scanner;

public class PrintNumNotDivisibleByGivenNum {

	public static void main(String[] args) {
			
			int array[] = {1,2,3,4,5,6,7,8,9,36};
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("enter the number: ");
			
			int input = scan.nextInt();
			
			for(int x:array) {
				if(x%input!=0) {
					System.out.println(x);
				}
			}
			
			scan.close();
		}

}
