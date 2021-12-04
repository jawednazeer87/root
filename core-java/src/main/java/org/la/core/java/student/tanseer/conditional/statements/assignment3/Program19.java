package org.la.core.java.student.tanseer.conditional.statements.assignment3;

public class Program19 {

	public static void main(String[] args) 
	{ 
		int a = 7 * 3 + 6 / 2 - 5;
		System.out.println(a);
        int b = 21 - 8 + a % 3 * 11;
        System.out.println(b);
        
        if(a < b)
        {
            System.out.println("A is less than B");
        }
        /*if(a = b)
        {
            System.out.println("A is equal to B");
        }*/
        if(a > b)
        {
            System.out.println("A is greater than B");
        }

	}
		
}


