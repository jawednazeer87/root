package org.la.core.java.student.tanseer.assignment4.loops;

/*
	int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;


 */

public class Program99 
{
	public static void main(String[] args) 
	{
		int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;    
        System.out.println(a);
        b = (a - --b) * c;
        
        System.out.println(b);
	}
}

