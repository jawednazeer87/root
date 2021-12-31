package org.la.core.java.student.waleed.homework.array.assignment5;

import java.util.Arrays;

public class Assign24AnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		int a [] =  {11, 7, 13, 77, 25, 21, 7, 11, 77,25};  
        int n = a.length;
        
                for(int i = 0; i < n; i++) {  
            for(int j = i + 1; j < n; j++) {  
                if(a[i] == a[j]) {
                	a[j] = a[n-1];
                	n--;
                	j--;
	
                    }
  
                         }
                       }
        //Copying only unique elements of array a into array b
            int b []  = Arrays.copyOf(a, n);
        
    
    
           for( int i = 0; i < b.length; i++) { 
            	
        	   System.out.print(a[i]+" ");  
            	
 
            }
	} 
}
            
       
