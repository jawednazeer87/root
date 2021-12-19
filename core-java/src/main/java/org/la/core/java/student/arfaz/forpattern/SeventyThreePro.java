	package org.la.core.java.student.arfaz.forpattern;

//Wap to print all Perfect numbers between 1 to n.

public class SeventyThreePro {
	public static void main(String[] args) {
		int s=0,temp=0;
		for (int n = 2; n < 10000; n++)  {
//			temp=n;
			for(int i=1;i<n;i++)  {
			if(n%i==0)
				s+=i;
//			System.out.println(s);
//			System.out.println(i);
			}
			if(temp==s)
				System.out.println(temp+" is Perfect number");
			else
				System.out.println("not a perfect");

		}
            		
	}

		
	
		
}
