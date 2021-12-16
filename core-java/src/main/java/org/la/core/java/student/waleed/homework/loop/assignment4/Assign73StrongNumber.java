package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign73StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n = 145;
		int sum=0, r,temp;
		temp =n;
		 for (; n>0;) {
			 
			 r = n% 10;
			 int fact = 1;
			for(int i =1; i<=r; i++)
			{
				fact= fact * i;
				System.out.println(  "fact = "+ fact);
			}
			sum = sum + fact;
			System.out.println(  "sum = "+ sum);
			n= n/10;
			}
		 if(temp ==sum)
	            System.out.println( temp + " is a strong number.");
	        
	        
	        else
	            System.out.println(temp + " is not a strong number.");
	      
		
		
		
		

	}
}
   

		
	