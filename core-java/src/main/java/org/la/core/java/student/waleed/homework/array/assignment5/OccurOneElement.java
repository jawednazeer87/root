package org.la.core.java.student.waleed.homework.array.assignment5;

public class OccurOneElement{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 int count = 0;
		int x =7;
        int a[] = {7,11,99,200,8,7,21,7,99,101,111};
     
        
        for(int i = 0; i < a.length; i++)
        {
        	
     
        	
      
   
            if(a[i] == x)
            {
                count++;
            }
        }
        System.out.println("Number of Occurrence of the Element " + x+" = "+count);
    }
		
		
		
	}


