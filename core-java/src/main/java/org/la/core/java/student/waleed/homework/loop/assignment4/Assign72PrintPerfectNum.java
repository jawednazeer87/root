package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign72PrintPerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	       int n= 10000;
	       
        for (int i = 1; i<=n; i++) {
        	
        	int sum =0; 
        	
        	
        	   for (int j = 1; j<i; j++) {
     
            if (i % j == 0) {
         	    
                 sum += j;
                             }
                     }
        
            if(sum==i)
            System.out.println(i+ " is a perfect number");
            
           
            
	
	             }

           }
		
		
	}


