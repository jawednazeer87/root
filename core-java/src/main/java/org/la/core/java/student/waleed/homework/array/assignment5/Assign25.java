package org.la.core.java.student.waleed.homework.array.assignment5;


public class Assign25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[] = {11, 7, 13, 77, 25, 21, 100, 50,5};
		int n = a.length;
	     int av=0;
		int sum= 0;
	     
	        
	        
	        for (int i=0; i<=n-1; i++){
	            sum+=a[i];
	        }
	        av=sum/n;
	        {System.out.print("Average ="+ av );}
	                
	    
	}

}
