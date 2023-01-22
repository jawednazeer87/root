package org.jn.core.java.student.mirza.baig.method;

public class FactorialNumber {

	
	
	public static int fact(int x) {
		int fact=1;
		
		for (int i=1; i<=x; i++)
			
			fact=fact*i;
		
		System.out.println(fact);
		
		return fact;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fact(5);

	}

}
