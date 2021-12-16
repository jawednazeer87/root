package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign67PrintPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i,j,count=0;
		int n= 110;
        //print prime no between 1 to 110
        System.out.println("prime number between 1 to 110\n");
        
        //loop for printing prime no between 1 to 100
        for(i=2;i<=n;i++)
        {
           for(j=1;j<=i;j++)
           {
             if(i%j==0) 
               count++;
              
           }
           if(count==2)
             System.out.print(" "+i);
           count=0;
         }
		
		
		
	}
}
	



