package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign74PrintStrognNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 90000;
		
		for(int j=1; j<=n; j++) {
			int sum=0, r;
		
			int temp = j;
			
		
		 for (; temp>0;) {
			 
			 r = temp % 10;
			 int fact = 1;
			for(int i =1; i<=r; i++)
			{
				fact= fact * i;
				
			}
			sum = sum + fact;
			temp = temp/10;
			}
		 if(j ==sum)
	            System.out.println( j + " is a strong number.");
	        
	       	
	}
		
		
	}

}
