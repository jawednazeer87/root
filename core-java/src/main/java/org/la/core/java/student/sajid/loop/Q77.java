package org.la.core.java.student.sajid.loop;

public class Q77 {
	public static void main(String[] args) {
		int rows=5;
		 for (int i=1; i<=rows; i++)
	        {
	      
	            for (int j=1; j<i; j++) 
	            { 
	                System.out.print(""); 
	            } 
	           
	            for (int k=rows; k>=i; k--)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
