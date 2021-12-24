	package org.la.core.java.student.arfaz.forpattern;

//Wap to find sum of all prime numbers between 1 to n.

public class SixtyNinePro {
	public static void main(String[] args) {
		int i=0,n=0,m=30,su=0;
		for(int j=2;j<=m;j++) {
			n=j;
			for(  i=2;i<n;i++) {
				if(n%i==0)
					break;

				}
				if(i==n)  {
					System.out.println(n);
				su+=n;//su=su+n;
				}
		}
			
	System.out.println(su);
	
	}

		
	
		
}
