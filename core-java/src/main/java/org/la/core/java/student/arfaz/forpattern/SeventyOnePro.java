	package org.la.core.java.student.arfaz.forpattern;

//Wap to check whether a number is Armstrong number or not 1 to n

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
				if(arm==i) // i here because i is original number to get after perform armstrong and m is not a original 
			System.out.println(i);	
		}
		
	}

		
	
		
}
