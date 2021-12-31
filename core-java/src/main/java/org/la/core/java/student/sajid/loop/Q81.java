package org.la.core.java.student.sajid.loop;

public class Q81 {
	public static void main(String[] args) {
		int rows=5;
		for (int i=rows; i>=1; i--)
        {
            // Print star in decreasing order
            for (int k=1; k<=(i * 2) -1; k++) 
            { 
                System.out.print("*"); 
            } 
            System.out.println(); 
            // Print space in increasing order 
            for (int j=rows; j>=i; j--)
            {
                System.out.print(" ");
            }
            
        }
	}

}
