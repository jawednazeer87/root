package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {20, 20, 30, 40, 50, 50, 50};
	     
        int index =0;
	  for(int i = 0; i < a.length-1; i++)
      {
            if(a[i] !=a[i+1]) {
       
                a[index++] = a[i];  
          }
      }
	  a[index++] = a[a.length-1];
	  
      for(int i = 0; i <index; i++)
      	
        System.out.print( a[i]+" ");
		
		
		
		
		
		
		
	}

}
