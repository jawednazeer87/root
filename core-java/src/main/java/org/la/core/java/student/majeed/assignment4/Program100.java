package org.la.core.java.student.majeed.assignment4;

public class Program100 {

	public static void main(String[] args) {
		/* 100.	what will be output: 
		int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;	 
		*/
		int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;
        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b);
        System.out.println("Value of c is: "+c);
				
	}

}
