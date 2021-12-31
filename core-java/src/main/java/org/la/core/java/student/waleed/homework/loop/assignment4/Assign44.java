package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

        int a[] = {10,50,100,200,1000,5000};
     
        int index =0;
	  for(int i = 0; i < a.length; i++)
      {
    
                a[index++] = a[i]/2;
           
        }
     
      for(int i = 0; i <index; i++)
      	
        System.out.print( a[i]+" ");
		
	}
		
	}


