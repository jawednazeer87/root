package org.jn.core.java.student.mirza.baig.Array;

import java.util.Scanner;

public class NumDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  int [] num= {1,2,3,4,5,6,7,8,9};
		  
		  Scanner sc=new Scanner(System.in);
		  
		  int input=sc.nextInt();
		  
		  for (int i=1; i<num.length; i++) {
			  
			  if ( num[i]%input==0)
				  
				  System.out.println(num[i]);
		  }
	}

}

// wap to print number divisible by given number from an array