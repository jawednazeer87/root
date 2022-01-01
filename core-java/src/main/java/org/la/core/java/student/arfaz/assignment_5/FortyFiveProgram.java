	package org.la.core.java.student.arfaz.assignment_5;



/*  	wap to add all even numbers of an array and print the sum
		Suppose given array is [10, 19, 2, 7] -> sum=12 which is sum of 10 and 2, both are even
 */

public class FortyFiveProgram {

	public static void main(String[] args) {

		int n[]= {10, 19, 2, 7},s=0; 
		
		
		for(int i=0;i<n.length;i++)  {
		if(n[i]%2==0) {
			s=s+n[i];
//			System.out.println(s);	
				
		}
	}
		System.out.println(s);
			 
				
		
	}

}
