package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		 int count = 0;
		int x =1;
       int a[] = {7,11,1,10,1,7,21,7,99,101,1};
    
       
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
