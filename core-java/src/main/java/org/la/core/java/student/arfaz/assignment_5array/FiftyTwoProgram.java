	package org.la.core.java.student.arfaz.assignment_5array;



/*  	wap to add all elements of an array and check whether the sum is a prime number or not?
		Suppose given array is [10, 19, 2, 7] -> sum=38 is not a prime number
		Suppose given array is [10, 8, 2, 9] -> sum=29 is a prime number
*/

	

public class FiftyTwoProgram {

	public static void main(String[] args) {

		int n[]= {10, 8, 2, 9},j=0,s=0,k=0; 
		
		
		
			for(k=0;k<n.length;k++)  {
			   s +=n[k];	
			}
			  
			for(j=2;j<s;j++)   {
				if(s%j==0)
					break;
				
			}
			if(j==s) {
					System.out.print(s+" is a prime no ");
			}
			else 
				System.out.println(s+" is not a prime number");
	
	}

			 
				
		
	}


