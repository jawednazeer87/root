package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {7,9,5,44,11};
	     
        boolean  flag = true;
	  for(int i = 0; i < a.length; i++)
      {
            if(a[i] == 0 || a[i]==-1) {
            	System.out.println("Array of integers with 1 or 0");
            	
            	flag=false;
            	break;
            	
        }
            else
            	System.out.println("Array of integers without 1 and 0");
      }
	  if( flag == true) {
	
      for(int k = 0; k<a.length; k++)
      	
        System.out.print( a[k]+" ");
		
	}
}
}


		
		



