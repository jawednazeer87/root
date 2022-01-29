package org.la.core.java.student.moshin.assignment6;

public class Assignment32 {
	
	public static void main(String[] args) {
		
		int a[] = {1,0,1,0,0,1,1};
	     
	       int b[]=  countOneZero( a);
	       int index= 0;
	       for(int i:b) {
	    
	    	   System.out.println("b["+index+"] = "+i);
	    	   index++;
	    	   }
	       
	  
		}
	      static int [] countOneZero(int a[]) { 
	    	  
	    	  int count1 = 0;
	    	  int count2= 0;
	       for(int i = 0; i < a.length; i++)
	       {
	       
	           if(a[i] == 1)
	           {
	               count1++;
	          
	          
	           }
	           if(a[i] == 0)
	           {
	               count2++;
	               
	           }
	          
	       }
	       int b[]= new int[2];
	    
        b[0]=count1;
        b[1]=count2;
   	   
		return b;	
		
		}
			
		
		
	}


