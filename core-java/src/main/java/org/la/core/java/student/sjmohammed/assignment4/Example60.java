package org.la.core.java.student.sjmohammed.assignment4;

public class Example60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 123524, p= 1;
        while (n > 0){
        	int r=n%10;
        	p=p*r;
        	n=n/10; 	
        }   
        System.out.println(p);
      
	}

}
