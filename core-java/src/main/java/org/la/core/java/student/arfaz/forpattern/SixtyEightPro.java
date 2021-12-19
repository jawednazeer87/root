package org.la.core.java.student.arfaz.forpattern;

//print all Prime numbers between 1 to n

public class SixtyEightPro {
	public static void main(String[] args) {
		int i=0,n=0,m=30;
		for(int j=2;j<=m;j++) {
			n=j;
			for(  i=2;i<n;i++) {
				if(n%i==0)
					break;

				}
				if(i==n)
					System.out.println(n);
				
		}
			}	
		
	
		
}
