package org.la.core.java.student.tanseer.assignment4.loops;
import java.util.*;

public class Program41Factorial {

	public static void main(String[] args) {
		
		int n ,fact =1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		n = sc.nextInt();
		
		for(int i = 1 ; i<=n ; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+n+" is: "+fact);  
		sc.close();
		
		
	}

}
