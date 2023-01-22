package org.jn.core.java.student.mirza.baig.Array;

public class CopyofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] a = {1,3,4,5};
		
		
		   int [] b =new int [a.length];

		   for (int i=0; i<a.length ; i++) {
			   b[i]=a[i];
			   
			
			System.out.print(a[i]+" ");
		}
		 System.out.println();

		 for (int i=0; i<b.length; i++) {
			  
			 
			 System.out.print( b[i]+" ");
		 }
	}
   
   
	}


