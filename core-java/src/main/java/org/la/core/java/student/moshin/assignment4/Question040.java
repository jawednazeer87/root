package org.la.core.java.student.moshin.assignment4;

public class Question040 
{
	
	//40.	wap to find factorial of a given number

    public static void main(String[] args) {
        int n = 4, f = 1;
        while (n >= 1) {
            f *= n;
            n--;
        }
        System.out.println(f); //4*3*2*1=24
	}
}

