package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {7,11,99,200,8,100,200,500};
	     
        int index =0;
        for(int i = 0; i < a.length; i++)
        {
        	 
            if(a[i] == 99) {
            index = i;
            a[i]=111;
        System.out.println(" Index  = "+ index);
        }  
         
        }
        System.out.println("------------------------------------------------------- ");
            for(int k = 0; k < a.length; k++)
            	  System.out.print(a[k]+ " " );	
            
	
	}

}
