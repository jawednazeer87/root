package org.la.core.java.student.moshin.assignment6;

public class Assignment05 {
	public static void main(String[] args) {
		int x =7;
        int a[] = {88,11,99,200,8,100,200,500,7};
        printNum(a,x);
        }
        static void printNum(int a [], int x) {
        int k=0;
        for( int i :a )
        {
        	k=i;
            if(i == x)
            {
            break;	
            }
        }
        if(k == x)
        {
        	System.out.println("The specific Element " + x+" is exited ");
        }
        else {
        	System.out.println("not found" );
        	}
	}
}