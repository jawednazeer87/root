	package org.la.core.java.student.arfaz.forpattern;

//Wap to check whether a number is Armstrong number or not.

public class SeventyPro {
	public static void main(String[] args) {
		int m=153,rem, arm=0;
		int j=1;
		while(m!=0) {
	   		rem = m%10;
	   		arm =arm + rem*rem*rem;
	   		m=m/10;
	   		System.out.println("m="+m+"j="+j);
	   		j++;
		}
			
		System.out.println(arm);
	}

		
	
		
}
