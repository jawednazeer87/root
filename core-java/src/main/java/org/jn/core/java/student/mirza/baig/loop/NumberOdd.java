package org.jn.core.java.student.mirza.baig.loop;

import java.util.Scanner;

public class NumberOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number ");
        int N=sc.nextInt();
        
        for (int i=1; i<=N; i++) {
        	
        	if (i%2!=0) {
        		
        		sum +=i;
        		
        	}
        }
	System.out.println("sum of all odd number between 1 to N "+ N+" = "+sum);
	}
	

}
