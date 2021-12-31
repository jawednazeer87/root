package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		

        int a[] = {995,94,15,195,385,95};
     
        int index =0;
	  for(int i = 0; i < a.length; i++)
      {
    
                a[index++] = a[i]+5;
           
            
        }
     
	  
      for(int i = 0; i <index; i++)
      	
        System.out.print( a[i]+" ");
		
	}

}
