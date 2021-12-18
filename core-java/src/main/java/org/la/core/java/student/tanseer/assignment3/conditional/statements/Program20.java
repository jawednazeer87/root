package org.la.core.java.student.tanseer.assignment3.conditional.statements;

public class Program20 {

	public static void main(String[] args) 
	{ 
		int a = 12 + 21 * 3 - 9 / 2;
		System.out.println("a = " +a); // 71
        
		int b = 14 - 32 * 4 + 175 / 8 - 3;
        System.out.println("b = " +b); // -96  
        
        if(++a > 71 && --b < 20)
        {
            System.out.println("a = " + a + " b = " + b);
        }
        if(b-- == -97 || a-- < 100)
        {
            System.out.println("a = " + a + " b = " + b);
        }

	}
		
}


