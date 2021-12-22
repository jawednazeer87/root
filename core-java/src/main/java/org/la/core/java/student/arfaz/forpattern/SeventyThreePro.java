	package org.la.core.java.student.arfaz.forpattern;

//Wap to print all Perfect numbers between 1 to n.

public class SeventyThreePro {
	public static void main(String[] args) {
		int s=0;
		for (int n = 1; n < 1000; n++)  {
			s=0;

			for(int i=1;i<n;i++)  {
			if(n%i==0)
				s+=i;
			
			}
			if(n==s)
				System.out.println(s+" is Perfect number");
			
		}
			
	}

		
	
		
}
