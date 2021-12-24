package org.la.core.java.student.waleed.homework.array.assignment5;

public class Assign28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int a[] = {7,11,99,200,100,300,400,500};
     
        int index =0;
	  for(int i = 0; i < a.length; i++)
      {
            if(a[i] != 99) {
        System.out.println( " index ="+ index+"-----"+"a["+i+"]"+" = "+ a[i]);
            a[index++] = a[i];
           
            
        }
      }
	  
	 // a[index++] = a[a.length-1];
	  System.out.println("index =" + index);
      for(int i = 0; i <index; i++)
      	
        System.out.print( a[i]+" ");
		
	}

}
