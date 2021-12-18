package org.la.core.java.student.sjmohammed.assignment4;

public class Example59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n= 1234, s= 0;
        while (n > 0){
        	int r=n%10;
        	s=s+r;
        	n=n/10; 	
        }   
        System.out.println(s);
	}

}
