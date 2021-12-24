	package org.la.core.java.student.arfaz.forpattern;

//Wap to print Fibonacci series up to n terms
public class SeventySixPro {
	public static void main(String[] args) {
		int a=0,b=1,n=10,fib=0;
		System.out.print(a+" "+b);
	
			for(int i=2;i<n;i++)  {
				fib=a+b;
				
				
				System.out.print(" "+fib);
				
				a=b;
			    b=fib;		
				}
					
		
				
		
	}

		
	
		
}
