package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign69ArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int r, res=0, n=0;
	    int num = 407;
	    int temp =num;
		 
		 
        for(; temp>0;n++) {
        	
            temp=temp/10;
                }
           temp=num;
            
        for(; temp>0;) {
        	
            r = temp %10;
            res=res + (int)  Math.pow(r,n);
            temp=temp/10;
        }
        if(res ==num)
            System.out.println( num + " is an Armstrong number.");
        
        
        else
            System.out.println(num + " is not an Armstrong number.");
      
      }
}
		
		
	


