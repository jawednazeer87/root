package org.la.core.java.student.arfaz.assignment_5array;


//  wap to calculate the factorial of each element of an array?

public class TwentyTwoProgram {

	public static void main(String[] args) {

			int arr[] = new int[5], i=0,k=0,j=0,fact=1;
		
		
		for( i=0,j=1;i<arr.length&j<=arr.length;i++,j++) {
			
					arr[i]=j;
					fact=1;
					for( k=1;k<=arr[i];k++) {
							fact = fact*k;
//							System.out.println(fact);
						}
					
						System.out.println(j+"! = "+fact);
					
	  	  }
		  	 
			 
		
	}

}
