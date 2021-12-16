package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Output08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;
	
        
    	System.out.println("a = "+ a );
    	System.out.println("b = "+ b );	
    	System.out.println("c = "+ c );
	}

}
