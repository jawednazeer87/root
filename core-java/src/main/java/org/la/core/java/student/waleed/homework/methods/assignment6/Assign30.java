package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign30 {

	public static void main(String[] args) {
		   
	     
	       int a[] = {1,0,1,0,0,1,1,0};
	      int x =0;
	       int count=  countZero( a);
	       
	       System.out.println("Number of Occurrence of the Element " + x+" = "+count);
		}
	      static int countZero(int a[]) { 
	    	  
	    	  int count = 0;
	    	 
	       for(int i = 0; i < a.length; i++)
	       {
	       
	           if(a[i] == 0)
	           {
	               count++;
	           }
	       }
	       
		return count;	
		}
		

	}


