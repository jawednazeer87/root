	package org.la.core.java.student.arfaz.forpattern;

//Wap to check whether a number is Armstrong number or not.

public class SeventyOnePro {
	public static void main(String[] args) {
		int m,rem, arm=0,n=1000;
		for(int i=1;i<=n;i++)  {
			m=i;
			arm=0;
			
			while(m!=0) {
		   		rem = m%10;
		   		arm =arm + rem*rem*rem;
		   		m=m/10;
			}
				if(arm==m)
			System.out.println(i);	
		}
		
	}

		
	
		
}
