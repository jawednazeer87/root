package org.la.core.java.student.mdfarman.loop.assignment4;


public class Question79 {

	//		79.
//		    *
//		   **
//		  ***
//		 ****
	public static void main(String[] args) {
		int n=4;  
		//inner loop  
		for (int i= 0; i<= n; i++)  
		{  
			for (int j=1; j<=n-i; j++)  
				System.out.print(" ");  
			for (int k=0;k<=i;k++)  
				System.out.print("*");  
			System.out.println("");  
		}  


	}
}