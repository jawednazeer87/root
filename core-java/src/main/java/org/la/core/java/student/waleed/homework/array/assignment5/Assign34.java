package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		

        int a[] = {7,0,99,0,100,10,0,5,20,0,77,0};
     
        int index =0;
	  for(int i = 0; i < a.length; i++)
      {
            if(a[i] !=0) {
       
                a[index++] = a[i];
           
            
        }
      }
	  
      for(int i = 0; i <index; i++)
      	
        System.out.print( a[i]+" ");
		
		
		
		
		
		
	}

}
