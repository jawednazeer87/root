package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

        int a[] = {7,9,11,100,201,78};
     
        int index =0;
	  for(int i = 0; i < a.length; i++)
      {
    
                a[index++] = a[i]-1;
           
            
        }
     
	  
      for(int i = 0; i <index; i++)
      	
        System.out.print( a[i]+" ");
		
	}

}
