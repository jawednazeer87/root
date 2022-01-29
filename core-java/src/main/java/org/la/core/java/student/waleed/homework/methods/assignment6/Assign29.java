package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign29 {

	public static void main(String[] args) {

     
       int a[] = {1,2,1,3,2,1,1,1};
       int x =1;
       int count=  countOnes( a);
       
       System.out.println("Number of Occurrence of the Element " + x+" = "+count);
	}
      static int countOnes(int a[]) { 
    	  
    	  int count = 0;
    	 
       for(int i = 0; i < a.length; i++)
       {
       
           if(a[i] == 1)
           {
               count++;
           }
       }
       
	return count;	
	}
		
	}


