package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign70PrintArmStromgNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	    int a = 6;
		for( int i = 1; i<=a;i++ ) {
			int r, res=0, n=0;
		 int temp =i;
	
        for(; temp>0;n++) {
        	
            temp=temp/10;
                }
           temp=i;
            
        for(; temp>0;) {
        	
            r = temp %10;
            res=res + (int)  Math.pow(r,n);
            temp=temp/10;
        }
        if(res ==i)
            System.out.println( i + " is an Armstrong number.");
        
       
      
      }
}
		
		
		
	}


