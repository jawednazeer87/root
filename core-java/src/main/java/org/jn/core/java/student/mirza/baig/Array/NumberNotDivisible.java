package org.jn.core.java.student.mirza.baig.Array;

import java.util.Scanner;

public class NumberNotDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] num= {1,2,3,4,5,6,7,8,9};
		
		Scanner sc = new Scanner(System.in);
		
		int input=sc.nextInt();
		
		
		for(int x: num) {
			
			if (x%input!=0) {
				
				System.out.println(x);
			}
		}
	}

}
