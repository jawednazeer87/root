package org.la.core.java.student.tanseer.assignment3.conditional.statements;

public class Program23 {

	public static void main(String[] args) 
	{ 
		int x = 20;
        int y = 25;
    
        if (++x < (y = y -= 4) || (x = x += 4) > y) {
        	
            System.out.println(x + "," + y);
        }

	}
		
}


