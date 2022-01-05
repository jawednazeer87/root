	package org.la.core.java.student.arfaz.assignment_5;



/*  	wap to count all prime numbers of an array?
		Suppose given array is [100, 19, 2, 7, 50] -> 19, 2, 7 are prime numbers so the count = 3*/

	

public class FiftyOneProgram {

	public static void main(String[] args) {

int n[]= {100, 19, 2, 7, 50},j=0,c=0; 
		
		
		for(int i=0;i<n.length;i++)  {
			  
			for(j=2;j<n[i];j++)   {
				if(n[i]%j==0)
					break;
				
			}
			if(j==n[i]) {
				c++;
				System.out.print(j+" ");
			}
		}
		System.out.println("\n"+c);
	}

			 
				
		
	}
